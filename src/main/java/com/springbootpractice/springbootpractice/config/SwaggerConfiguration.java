package com.springbootpractice.springbootpractice.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//http://localhost:8080/swagger-ui/index.html

@OpenAPIDefinition(
        info = @Info(title = "Spring boot API test",
                description = "스프링 부트 API 테스트",
                version = "0.0.1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfiguration {

    @Bean
    public GroupedOpenApi chatOpenApi() {
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .group("all")
                .pathsToMatch(paths)
                .build();
    }
}