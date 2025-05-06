package com.rest.api.myjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@GetMapping(value = "/welcome")
	public String getMassage() {
		return "Welcome to you on My site";
	}

}
