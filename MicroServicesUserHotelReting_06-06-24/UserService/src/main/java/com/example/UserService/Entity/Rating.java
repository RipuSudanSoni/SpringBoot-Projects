package com.example.UserService.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
	
	private Long ratingId;
	private Long userId;
	private Long hotelId;
	private int rating;
	private String feedback;
	
	private Hotel hotel;
	

}
