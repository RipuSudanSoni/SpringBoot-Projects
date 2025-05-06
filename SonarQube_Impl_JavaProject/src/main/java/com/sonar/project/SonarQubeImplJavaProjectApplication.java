package com.sonar.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarQubeImplJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarQubeImplJavaProjectApplication.class, args);
		
		
		int arr[]= {3,7,4,8,9,34,100};
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String string = "";
		
		System.out.print("Hello testing ...........");
		
	}

}
