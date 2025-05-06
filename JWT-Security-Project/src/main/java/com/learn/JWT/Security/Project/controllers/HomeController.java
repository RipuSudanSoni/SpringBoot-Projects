package com.learn.JWT.Security.Project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/home")
	public String homePage() {
		return "This is Home Page !";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "This is Login Page !";
	}
	
	@GetMapping("/register")
	public String RegisterPage() {
		return "This is Register Page !";
	}
}
