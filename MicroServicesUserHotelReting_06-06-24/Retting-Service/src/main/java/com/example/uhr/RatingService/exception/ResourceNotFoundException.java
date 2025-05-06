package com.example.uhr.RatingService.exception;

import java.util.function.Supplier;

public class ResourceNotFoundException extends RuntimeException {

	
	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
