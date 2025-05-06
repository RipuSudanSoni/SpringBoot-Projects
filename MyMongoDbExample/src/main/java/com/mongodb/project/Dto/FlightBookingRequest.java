package com.mongodb.project.Dto;

import com.mongodb.project.entity.PassengerInfo;
import com.mongodb.project.entity.PaymentInfo;

import lombok.Data;

@Data
public class FlightBookingRequest {
	
	private PassengerInfo passengerInfo;
	
	private PaymentInfo paymentInfo;

}
