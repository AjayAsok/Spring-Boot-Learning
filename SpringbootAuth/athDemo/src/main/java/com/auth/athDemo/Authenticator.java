package com.auth.athDemo;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
//@Order(SecurityProperties.BASIC_AUTH_ORDER)
public class Authenticator extends WebSecurityConfigurerAdapter{
@Override
protected void configure
}
