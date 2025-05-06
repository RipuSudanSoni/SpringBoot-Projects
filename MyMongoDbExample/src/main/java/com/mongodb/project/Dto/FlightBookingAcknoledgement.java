package com.mongodb.project.Dto;

import com.mongodb.project.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknoledgement {
	
	private String statu;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
	

}
