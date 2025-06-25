package com.example.spro02.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
// @ConfigurationProperties("jwt") : application.properties에 정의된 속성들을
// JAVA 객체의 필드에 자동으로 매핑
// "jwt"는 설정 속성의 접두사(prefix)를 지정
@Setter
@Getter
@Component
@ConfigurationProperties("jwt")

public class JwtProperties {
    private String issuer;
    private String secretkey;
}
