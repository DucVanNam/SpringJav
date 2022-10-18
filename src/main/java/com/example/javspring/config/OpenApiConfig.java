package com.example.javspring.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
//        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
//                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))

                .info(new Info().title("Demo API").version("v1"));
    }
}
