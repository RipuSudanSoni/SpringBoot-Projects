package com.example.hotel.Hotel.Service.UHS.Exception;

public class ResorceNotFoundException extends RuntimeException{

	public ResorceNotFoundException() {
		super("Resounce Not Found !!");
	}
	
	public ResorceNotFoundException(String msg) {
		super(msg);
	}
}
