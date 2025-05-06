package com.mongodb.project.entity;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;


//@Document(collation = "Payment_Info")
@Data
@Entity
public class PaymentInfo {
	
	@Id
	private long paymentId;
	
	//@Field(name = "account_no")
	@Column(name = "account_no")
	private String accountNo;
	
	@Column(name = "ammount")
	private double ammount;
	
	@Column(name = "card_type")
	private String cardType;
	
	@Column(name = "passenger_id")
	private long  passId;

}
