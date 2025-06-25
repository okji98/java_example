package com.example.spro02.config.oauth;

import com.example.spro02.domain.User;
import com.example.spro02.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * OAuth2 사용자 정보를 처리
 * Spring Security OAuth2 클라이언트의 사용자 정보를 로드한 후, DB에 사용자 정보를 저장하거나 업데이트.
 */
@RequiredArgsConstructor
@Service
public class OAuth2UserCustomService extends DefaultOAuth2UserService {

    // 사용자 정보를 저장하고 조회하기 위한 레포지토리
    private final UserRepository userRepository;

    /**
     * OAuth2 사용자 정보를 로드하고, DB에 저장하거나 업데이트.
     * 부모 클래스(DefaultOAuth2UserService)의 사용자 로드 기능을 호출한 뒤, 커스텀 저장/업데이트 로직을 수행.
     */
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        // 부모 클래스의 메서드를 호출하여 OAuth2 사용자 정보 로드
        OAuth2User user = super.loadUser(userRequest);
        // 사용자 정보를 DB에 저장하거나 업데이트
        saveOrUpdate(user);
        System.out.println("....... OAuth2UserCustomService.loadUser => " + user);
        System.out.println("OAuth2UserCustomService.loadUser" + user);
        // 로드된 OAuth2User 객체 반환
        return user;
    }

    /**
     * OAuth2 사용자 정보를 기반으로 DB에 사용자 저장 또는 업데이트.
     * 이메일로 기존 사용자를 조회하고, 없으면 새 사용자를 생성하며, 있으면 이름을 업데이트.
     */
    private User saveOrUpdate(OAuth2User oAuth2User) {
        // OAuth2 사용자 속성(예: 이메일, 이름) 가져오기
        Map<String, Object> attributes = oAuth2User.getAttributes();

        // 사용자 속성에서 이메일과 이름 추출
        String email = (String) attributes.get("email");
        String name = (String) attributes.get("name");

        // 이메일로 기존 사용자 조회
        User user = userRepository.findByEmail(email)
                // 기존 사용자가 있으면 이름 업데이트
                .map(entity -> entity.update(name))
                // 기존 사용자가 없으면 새 사용자 생성
                .orElse(User.builder()
                        .email(email)
                        .nickname(name)
                        .build());

        // 사용자 정보를 DB에 저장
        return userRepository.save(user);
    }
}