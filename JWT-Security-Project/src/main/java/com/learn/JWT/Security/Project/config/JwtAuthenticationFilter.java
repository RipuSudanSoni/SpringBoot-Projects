package com.learn.JWT.Security.Project.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.learn.JWT.Security.Project.helper.JwtUtil;
import com.learn.JWT.Security.Project.service.CustomUserDetailsService;

@Configuration
public class JwtAuthenticationFilter extends OncePerRequestFilter{
	
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		// get jwt
		// Bearer
		// validate
		
		String requestTokenHeader =  request.getHeader("Authorization");
		String userName = null;
		String jwtToken = null;
		
		if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
			
			jwtToken = requestTokenHeader.substring(7);
			try {
				userName = jwtUtil.getUsernameFromToken(jwtToken);
				System.out.println("#################### user name"+userName);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(userName);
			
			if(userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getAuthorities());
				
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			
				
			} else {
				System.out.println("Token is not validated..");
			}
			
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@    OKKKKKK  1     @@@@@@@@@@@@@@@@@@");
		 filterChain.doFilter(request, response);
		 System.out.println("@@@@@@@@@@@@@@@@@@@    OKKKKKK  2     @@@@@@@@@@@@@@@@@@");
	}

}
