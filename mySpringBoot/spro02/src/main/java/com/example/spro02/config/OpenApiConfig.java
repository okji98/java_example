package com.example.spro02.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Blog API")
                        .version("1.0")
                        .description("API 설명을 여기에 작성하세요.")
//                        .termsOfService("https://example.com/terms")
                        .contact(new Contact().name("연희직업전문학교").email("yeonhui@example.com")));
    }
}
