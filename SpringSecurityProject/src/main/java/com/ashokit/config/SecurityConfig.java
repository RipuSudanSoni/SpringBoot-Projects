package com.ashokit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/statement").authenticated()
		.antMatchers("/mylone").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}
	
	// using InMemori credential  >> means :- storing userName and password in memory i.e -> limited user.
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
			.withUser("ripu").password("ripu@123").authorities("admin").and()
			.withUser("suraj").password("suraj@123").authorities("read").and()
			.withUser("rohit").password("rohit@123").authorities("read").and()
			.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
}
