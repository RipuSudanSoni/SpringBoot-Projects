package com.mongodb.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyMongoDbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMongoDbExampleApplication.class, args);
		System.out.println("project started !!");
	}

}
