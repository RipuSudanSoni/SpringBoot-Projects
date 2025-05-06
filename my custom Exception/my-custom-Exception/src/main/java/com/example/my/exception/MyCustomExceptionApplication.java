package com.example.my.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCustomExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCustomExceptionApplication.class, args);
		System.out.println("My Custom project is running >>>>>>>>>>>>");
	}

}
