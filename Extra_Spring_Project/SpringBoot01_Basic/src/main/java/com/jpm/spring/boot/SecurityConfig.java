/**
 * 
 */
package com.jpm.spring.boot;

/**
 * @author Smita B Kumar
 *
 */
//SecurityConfig.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests(
				).anyRequest().authenticated().and().httpBasic();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user")
		.password("{noop}password").roles("USER");
	}
	/*
	 * Prefix all existing passwords with {noop} to keep the default encoder of Spring Security 5. According to spring security 5.0 's new feature. They write this. Spring Security's PasswordEncoder interface is used to perform a one way transformation of a password to allow the password to be stored securely.
	 */
}
