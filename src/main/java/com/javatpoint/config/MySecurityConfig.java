package com.javatpoint.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class MySecurityConfig extends WebSecurityConfiguration {

    protected void configure(HttpSecurity httpSecurity)throws Exception{

        httpSecurity
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }
}
