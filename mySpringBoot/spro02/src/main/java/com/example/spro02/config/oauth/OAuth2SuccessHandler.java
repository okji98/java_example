package com.example.spro02.config.oauth;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import com.example.spro02.config.jwt.TokenProvider;
import com.example.spro02.domain.RefreshToken;
import com.example.spro02.domain.User;
import com.example.spro02.repository.RefreshTokenRepository;
import com.example.spro02.service.UserService;
import com.example.spro02.util.CookieUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.time.Duration;

/**
 * OAuth2 인증 성공 시 처리 로직을 정의
 * 인증 후 액세스 토큰과 리프레시 토큰을 생성하여 쿠키에 저장하고, 클라이언트를 지정된 URL로 리다이렉트.
 */
@RequiredArgsConstructor
@Component
public class OAuth2SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    // 리프레시 토큰 쿠키의 이름
    public static final String REFRESH_TOKEN_COOKIE_NAME = "refresh_token";
    // 리프레시 토큰의 유효 기간 (14일)
    public static final Duration REFRESH_TOKEN_DURATION = Duration.ofDays(14);
    // 액세스 토큰의 유효 기간 (1일)
    public static final Duration ACCESS_TOKEN_DURATION = Duration.ofDays(1);
    // 인증 성공 후 리다이렉트할 경로
    public static final String REDIRECT_PATH = "/articles";

    // JWT 토큰 생성을 위한 TokenProvider
    private final TokenProvider tokenProvider;
    // 리프레시 토큰을 저장하기 위한 레포지토리
    private final RefreshTokenRepository refreshTokenRepository;
    // OAuth2 인증 요청 관련 쿠키를 관리하는 레포지토리
    private final OAuth2AuthorizationRequestBasedOnCookieRepository authorizationRequestRepository;
    // 사용자 정보를 조회하기 위한 서비스
    private final UserService userService;

    /**
     * OAuth2 인증 성공 시 호출
     * 사용자 정보를 기반으로 액세스 토큰과 리프레시 토큰을 생성하고, 쿠키에 저장한 후 지정된 URL로 리다이렉트.
     */
    @Override
    public void onAuthenticationSuccess(
            HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException {
        // 인증된 사용자의 OAuth2User 객체 가져오기
        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
        // OAuth2User의 이메일 속성을 사용해 사용자 정보 조회
        User user = userService.findByEmail((String) oAuth2User.getAttributes().get("email"));

        // 리프레시 토큰 생성 (유효 기간: 14일)
        String refreshToken = tokenProvider.generateToken(user, REFRESH_TOKEN_DURATION);
        // 리프레시 토큰을 데이터베이스에 저장
        saveRefreshToken(user.getId(), refreshToken);
        // 리프레시 토큰을 쿠키에 추가
        addRefreshTokenToCookie(request, response, refreshToken);

        // 액세스 토큰 생성 (유효 기간: 1일)
        String accessToken = tokenProvider.generateToken(user, ACCESS_TOKEN_DURATION);
        // 액세스 토큰을 포함한 리다이렉트 URL 생성
        String targetUrl = getTargetUrl(accessToken);

        // 인증 관련 속성 및 쿠키 정리
        clearAuthenticationAttributes(request, response);

        // 클라이언트를 지정된 URL로 리다이렉트
        getRedirectStrategy().sendRedirect(request, response, targetUrl);
    }

    /**
     * 사용자 ID와 새로운 리프레시 토큰을 데이터베이스에 저장.
     * 기존 리프레시 토큰이 있으면 업데이트, 없으면 새로 생성.
     */
    private void saveRefreshToken(Long userId, String newRefreshToken) {
        // 사용자 ID로 기존 리프레시 토큰 조회
        RefreshToken refreshToken = refreshTokenRepository.findByUserId(userId)
                // 기존 토큰이 있으면 업데이트
                .map(entity -> entity.update(newRefreshToken))
                // 없으면 새 RefreshToken 객체 생성
                .orElse(new RefreshToken(userId, newRefreshToken));

        // 리프레시 토큰 저장
        refreshTokenRepository.save(refreshToken);
    }

    /**
     * 리프레시 토큰을 HTTP 응답의 쿠키에 추가.
     * 기존 리프레시 토큰 쿠키를 삭제하고 새 쿠키를 추가.
     */
    private void addRefreshTokenToCookie(
            HttpServletRequest request, HttpServletResponse response, String refreshToken) {
        // 리프레시 토큰의 유효 기간을 초 단위로 변환
        int cookieMaxAge = (int) REFRESH_TOKEN_DURATION.toSeconds();

        // 기존 리프레시 토큰 쿠키 삭제
        CookieUtil.deleteCookie(request, response, REFRESH_TOKEN_COOKIE_NAME);
        // 새 리프레시 토큰 쿠키 추가
        CookieUtil.addCookie(response, REFRESH_TOKEN_COOKIE_NAME, refreshToken, cookieMaxAge);
    }

    /**
     * 인증 과정에서 사용된 임시 속성과 OAuth2 인증 요청 관련 쿠키를 정리.
     */
    private void clearAuthenticationAttributes(HttpServletRequest request, HttpServletResponse response) {
        // 부모 클래스의 인증 속성 정리 메서드 호출
        super.clearAuthenticationAttributes(request);
        // OAuth2 인증 요청 관련 쿠키 제거
        authorizationRequestRepository.removeAuthorizationRequestCookies(request, response);
    }

    /**
     * 액세스 토큰을 포함한 리다이렉트 URL 생성.
     * 기본 경로(/articles)에 액세스 토큰을 쿼리 파라미터로 추가.
     */
    private String getTargetUrl(String token) {
        return UriComponentsBuilder.fromUriString(REDIRECT_PATH)
                .queryParam("token", token)
                .build()
                .toUriString();
    }
}