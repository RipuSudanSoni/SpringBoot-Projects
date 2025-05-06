package com.lcwd.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserSercviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSercviceApplication.class, args);
		System.out.println("User Service Started");
	}

}
