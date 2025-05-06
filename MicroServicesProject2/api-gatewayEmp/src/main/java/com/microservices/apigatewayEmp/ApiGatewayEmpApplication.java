package com.microservices.apigatewayEmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayEmpApplication.class, args);
		System.out.println("Api gateway is started !!");
	}

}
