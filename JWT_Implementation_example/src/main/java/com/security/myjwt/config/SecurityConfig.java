package com.security.myjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.authentication.*;

//import com.mysql.cj.protocol.AuthenticationProvider;
import com.security.myjwt.service.MyUserUserDeatilsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	
	@Bean
	// authenticatrion
	public UserDetailsService userDetailsService() {
		
//		UserDetails admin = User.withUsername("Ripu")
//								.password(encoder.encode("Ripu@123"))
//								.roles("ADMIN")
//								.build();
//		
//		UserDetails user = User.withUsername("Golu")
//								.password(encoder.encode("Golu@123"))
//								.roles("USER")
//								.build();
//		
//		return new InMemoryUserDetailsManager(admin, user);
		
		return new MyUserUserDeatilsService();
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return http.csrf().disable()
			.authorizeHttpRequests().requestMatchers("/product/welcome", "/product/create/user").permitAll()
			.and()
			.authorizeHttpRequests().requestMatchers("/product/**").authenticated()
			.and().formLogin().and().build();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//		authenticationProvider.setUserDetailsService(userDetailsService());
//		authenticationProvider.setPasswordEncoder(passwordEncoder());
//		return authenticationProvider();
//	}

}
