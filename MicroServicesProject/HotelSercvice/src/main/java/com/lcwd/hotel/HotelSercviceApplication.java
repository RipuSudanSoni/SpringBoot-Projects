package com.lcwd.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelSercviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSercviceApplication.class, args);
		System.out.println("Hotel Service Started !!");
	}

}
