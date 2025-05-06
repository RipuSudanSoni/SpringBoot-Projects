package com.mongodb.project.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.project.Dto.FlightBookingAcknoledgement;
import com.mongodb.project.Dto.FlightBookingRequest;
import com.mongodb.project.entity.PassengerInfo;
import com.mongodb.project.entity.PaymentInfo;
import com.mongodb.project.repo.PassengerInfoRepo;
import com.mongodb.project.repo.PaymentInfoRepo;
import com.mongodb.project.utils.PaymentsUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepo passengerInfoRepo;
	
	@Autowired
	private PaymentInfoRepo paymentInfoRepo;
	
	
	public FlightBookingAcknoledgement bookFlightTicket(FlightBookingRequest request) {
		
		FlightBookingAcknoledgement acknoledgement = null;
		PassengerInfo passengerInfo = request.getPassengerInfo();
		PassengerInfo savedPassengerInfo = passengerInfoRepo.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		PaymentsUtils.validateCreaditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		
		paymentInfo.setPassId(passengerInfo.getPassId());
		paymentInfo.setAmmount(passengerInfo.getFare());
		paymentInfoRepo.save(paymentInfo);
		
		return new FlightBookingAcknoledgement("SUCCESS", passengerInfo.getFare(), "76786", passengerInfo);
		
	}
}
