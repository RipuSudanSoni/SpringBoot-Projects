package com.example.UserService.Exceptions;

public class ResourceNotFounfException extends RuntimeException{

	public ResourceNotFounfException() {
		super("Resouce not Found on server !!");
	}
	
	public ResourceNotFounfException(String msg) {
		super(msg);
		
	}
	
}
