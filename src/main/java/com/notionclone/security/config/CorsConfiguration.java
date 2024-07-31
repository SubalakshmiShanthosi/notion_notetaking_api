package com.notionclone.src.main.security.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class CorsConfiguration {

    public CorsConfiguration() {
        super();
        //TODO Auto-generated constructor stub
    }

    public void corsConfigurationSource(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.cors( c -> {
            CorsConfigurationSource source = s -> {
                org.springframework.web.cors.CorsConfiguration config = new org.springframework.web.cors.CorsConfiguration();
                config.addAllowedHeader("*");
                config.addAllowedMethod("*");
                config.addAllowedOrigin("http://localhost:3000");
                config.setAllowCredentials(true);
                return config;
            };
            c.configurationSource(source);
        });
    }
}