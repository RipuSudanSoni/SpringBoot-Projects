package com.rest.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("rest/api/welcome")
	public ResponseEntity<String> getMessage() {
		
		return new ResponseEntity<String>("Welcome to you on my website......................", HttpStatus.OK);
		//"Welcome to you on my website......................";
	}
	
	
}
