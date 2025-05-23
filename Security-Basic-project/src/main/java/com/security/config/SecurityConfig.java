package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public UserDetailsService userdetailsService(PasswordEncoder encoder) { 
	        
	        UserDetails admin = User.withUsername("Ripu")
	                .password(encoder.encode("Ripu@123"))
	                .roles("ADMIN")
	                .build();
	        
	        UserDetails user = User.withUsername("Siva")
	                .password(encoder.encode("Siva@123"))
	                .roles("USER")
	                .build();
	        return new InMemoryUserDetailsManager(admin, user);
	    }
	
	
	 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        return  http.csrf().disable()
	                .authorizeHttpRequests()
	                .requestMatchers("/welcome").permitAll()
	                .and()
	                .authorizeHttpRequests()
	                .requestMatchers("/emp/**")
	                .authenticated()
	                .and()
	                .formLogin()
	                .and()
	                .build();
	                
	    }
	 
	 @Bean
	 public PasswordEncoder passwordEncoder() {
	     return new  BCryptPasswordEncoder();
	        
	}

}
