package com.acme.olp.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  SecurityFilterChain filter(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(a -> a.requestMatchers("/actuator/**","/users/register").permitAll().anyRequest().authenticated())
        .oauth2ResourceServer(o -> o.jwt());
    return http.build();
  }
}
