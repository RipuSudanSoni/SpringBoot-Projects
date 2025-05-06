package com.learn.JWT.Security.Project.model;

public class JwtResponse {

	String token;
	
	public JwtResponse() {
		
	}
	
	public JwtResponse(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return this.token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
}
