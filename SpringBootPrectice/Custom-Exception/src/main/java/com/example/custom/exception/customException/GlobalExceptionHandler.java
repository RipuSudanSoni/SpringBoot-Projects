package com.example.custom.exception.customException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.example.custom.exception.entity.ApiError;



@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value = EmpNotFoundException.class)
	public ResponseEntity<ApiError> resourceNotFoundException(EmpNotFoundException ex) {
		
		ApiError error = new ApiError(400, "No Emp Found.", new Date());
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> "+ex);
		
		return new ResponseEntity <ApiError>(error, HttpStatus.NOT_FOUND);
	}
}
