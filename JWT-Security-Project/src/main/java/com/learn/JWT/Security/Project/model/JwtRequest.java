package com.learn.JWT.Security.Project.model;

public class JwtRequest {
	
	private String userName;
	private String password;
	
	
	public JwtRequest() {
		
	}
	
	public JwtRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtRequest [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
