package com.mongodb.project.entity;

import java.util.Date;

import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

//@Document("Passenger_Info")
//@Data
@Entity
public class PassengerInfo {
	
	@Id
	private long passId;
	
	//@Field(name = "Passenger_Name")
	@Column(name = "Passenger_Name")
	private String name;
	
	//@Field(name = "Passenger_Email")
	@Column(name = "Passenger_Email")
	private String email;
	
	@Column(name = "Source_location")
	private String source;
	
	@Column(name = "Destination_location")
	private String dstination;
	
	@Column(name = "traveling_Date")
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private Date travelDate;
	
	@Column(name="fare")
	private double fare;
	
	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public long getPassId() {
		return passId;
	}

	public PassengerInfo(long passId, String name, String email, String source, String dstination, Date travelDate) {
		super();
		this.passId = passId;
		this.name = name;
		this.email = email;
		this.source = source;
		this.dstination = dstination;
		this.travelDate = travelDate;
	}

	public PassengerInfo() {
		super();
	}

	public void setPassId(long passId) {
		this.passId = passId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDstination() {
		return dstination;
	}

	public void setDstination(String dstination) {
		this.dstination = dstination;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}	

}
