package com.lcwd.user.service.entity;

import lombok.Data;

@Data
public class Rating {
	
	private long ratingId;
	private long userId;
	private long hotelId; 
	private int rating;
	private String feedback;
	private Hotel hotel;

}
