package com.example.scheduling.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Logs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logId;
	
	private String logMessage;
	
	private String laoType;
	
	private String status;
	
	private Date createdAt;
	
	
}
