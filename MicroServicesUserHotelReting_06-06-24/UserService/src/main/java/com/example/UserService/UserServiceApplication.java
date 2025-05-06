package com.example.UserService;

import java.security.PublicKey;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.hibernate.type.descriptor.jdbc.BigIntJdbcType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println(">>>>>> User Service Is started........");
	}
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
