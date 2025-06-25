package com.example.spro02.config.oauth;

import com.example.spro02.util.CookieUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
import org.springframework.web.util.WebUtils;

/**
 * OAuth2 인증 요청(OAuth2AuthorizationRequest)을 HTTP 쿠키에 저장하고 관리하는 커스텀 레포지토리.
 * Spring Security OAuth2 클라이언트에서 인증 요청을 세션 대신 쿠키에 저장하도록 구현.
 */
public class OAuth2AuthorizationRequestBasedOnCookieRepository implements AuthorizationRequestRepository<OAuth2AuthorizationRequest> {
    // OAuth2 인증 요청을 저장하는 쿠키의 이름
    public final static String OAUTH2_AUTHORIZATION_REQUEST_COOKIE_NAME = "oauth2_auth_request";
    // 쿠키의 유효 기간 (18000초 = 5시간)
    private final static int COOKIE_EXPIRE_SECONDS = 5 * 60 * 60;

    /**
     * 요청에서 OAuth2 인증 요청을 로드하고, 해당 쿠키를 제거.
     * Spring Security가 인증 완료 후 호출하여 인증 요청 데이터를 반환.
     */
    @Override
    public OAuth2AuthorizationRequest removeAuthorizationRequest(
            HttpServletRequest request, HttpServletResponse response) {
        // 인증 요청을 로드하여 반환 (쿠키는 여기서 삭제하지 않음)
        return this.loadAuthorizationRequest(request);
    }

    /**
     * HTTP 요청에서 쿠키를 조회하여 OAuth2 인증 요청 객체를 로드.
     * 쿠키에 저장된 직렬화된 데이터를 역직렬화하여 반환.
     */
    @Override
    public OAuth2AuthorizationRequest loadAuthorizationRequest(HttpServletRequest request) {
        // 지정된 이름의 쿠키 조회
        Cookie cookie = WebUtils.getCookie(request, OAUTH2_AUTHORIZATION_REQUEST_COOKIE_NAME);
        // 쿠키를 역직렬화하여 OAuth2AuthorizationRequest 객체로 변환
        return CookieUtil.deserialize(cookie, OAuth2AuthorizationRequest.class);
    }

    /**
     * OAuth2 인증 요청을 쿠키에 저장하거나, 요청이 null이면 기존 쿠키를 삭제.
     * 인증 요청을 직렬화하여 쿠키에 추가하고 유효 기간을 설정.
     */
    @Override
    public void saveAuthorizationRequest(
            OAuth2AuthorizationRequest authorizationRequest, HttpServletRequest request, HttpServletResponse response) {
        // 인증 요청이 null인 경우, 기존 쿠키 삭제
        if (authorizationRequest == null) {
            removeAuthorizationRequestCookies(request, response);
            return;
        }
        // 인증 요청을 직렬화하여 쿠키에 저장 (유효 기간: 5시간)
        CookieUtil.addCookie(response, OAUTH2_AUTHORIZATION_REQUEST_COOKIE_NAME,
                CookieUtil.serialize(authorizationRequest), COOKIE_EXPIRE_SECONDS);
    }

    /**
     * OAuth2 인증 요청 관련 쿠키를 삭제.
     * 인증 프로세스 완료 후 임시 데이터를 정리할 때 사용.
     */
    public void removeAuthorizationRequestCookies(HttpServletRequest request, HttpServletResponse response) {
        // 지정된 이름의 쿠키 삭제
        CookieUtil.deleteCookie(request, response, OAUTH2_AUTHORIZATION_REQUEST_COOKIE_NAME);
    }
}
