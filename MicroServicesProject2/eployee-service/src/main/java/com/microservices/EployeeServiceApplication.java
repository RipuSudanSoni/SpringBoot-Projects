package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EployeeServiceApplication.class, args);
		System.out.println("Employee Service started !!");
	}

}
