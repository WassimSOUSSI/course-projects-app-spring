package com.wassim.springsecurityexample.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    // In-memory user details configuration
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails wassim= User.builder()
                .username("wassim")
                .password("{noop}123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        UserDetails user= User.builder()
                .username("user")
                .password("{noop}user")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(wassim,user);
    }

    // Provide roles to users
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests(cofigurer->
                cofigurer
                        .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT,"/api/employees/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN"));

        // Use HTTP basic authentication
        httpSecurity.httpBasic(Customizer.withDefaults());

        // Disable CSRF
        httpSecurity.csrf(csrf-> csrf.disable());

        return httpSecurity.build();
    }

}
