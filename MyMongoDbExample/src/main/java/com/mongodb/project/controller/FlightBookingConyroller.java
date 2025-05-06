package com.mongodb.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.project.Dto.FlightBookingAcknoledgement;
import com.mongodb.project.Dto.FlightBookingRequest;
import com.mongodb.project.service.FlightBookingService;


@RestController
public class FlightBookingConyroller {

	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping("rest/book/ticket")
	public FlightBookingAcknoledgement bookTicket(@RequestBody FlightBookingRequest request) {
		return flightBookingService.bookFlightTicket(request);
	}
	
}
