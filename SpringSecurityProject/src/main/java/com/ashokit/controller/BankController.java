package com.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping(value = "/home")
	public String home() {
		String msg = "Welcome to you on my Bank site.. !!";
		return msg;
	}
	
	@GetMapping(value = "/balance")
	public String getBalance() {
		String msg = "Your current balance is : 45367 INR";
		return msg;
	}
	
	@GetMapping(value = "/statement")
	public String getStmt() {
		String msg = "your statement generated and sent to your email id";
		return msg;
	}
	
	@GetMapping(value = "/mylone")
	public String getMyLoan() {
		String msg = "your loan amount Due : 45000 INR.";
		return msg;
	}
	
	@GetMapping(value = "/contact")
	public String contact() {
		String msg = "We will connect you soon. thank you..";
		return msg;
	}
}
