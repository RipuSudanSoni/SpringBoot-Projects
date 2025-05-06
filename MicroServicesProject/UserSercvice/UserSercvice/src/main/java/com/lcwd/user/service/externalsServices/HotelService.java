package com.lcwd.user.service.externalsServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lcwd.user.service.entity.Hotel;

// feignClient for communicate services one service to another service.

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

	
	@GetMapping("/rest/api/hotel/get/{id}")
	public Hotel getHotelById(@PathVariable("id") Long hotelId);
}
