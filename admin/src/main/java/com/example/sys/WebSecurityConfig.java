package com.example.sys;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }



    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(
                HttpMethod.GET,
                "/**/*.css",
                "/**/*.js",
                "/**/*.woff",
                "/error",
                "/**/*.js.map",
                "/",
                "/v2/api-docs",
                "/*.html",
                "/api/**",
                "/favicon.ico",
                "/**/*.html",
                "/test/**"
        );
        /**
         * 请求登录的地址
         */
        web.ignoring().antMatchers(HttpMethod.POST, "/**/login","/test/**","/api/get/user");
    }
}