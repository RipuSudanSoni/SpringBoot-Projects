package com.example.my.exception.customException;

import org.springframework.stereotype.Component;

//@Component
public class ResourceNotFoundException extends RuntimeException{

	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
