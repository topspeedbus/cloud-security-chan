package com.chan.chanauth.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @auther chan
 * @Date 2019/1/2 14:38
 */
@Order(SecurityProperties.BASIC_AUTH_ORDER - 6)
@Configuration
@EnableWebSecurity
public class ChanSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
    @Resource
    private FilterIgnorePropertiesConfig ignorePropertiesConfig;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http
                .formLogin().loginPage("/authentication/require")
                .loginProcessingUrl("/authentication/form")
                .and()
                .authorizeRequests();
        ignorePropertiesConfig.getUrls().forEach(url -> registry.antMatchers(url).permitAll());
        registry.anyRequest().authenticated()
                .and()
                .csrf().disable();
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
