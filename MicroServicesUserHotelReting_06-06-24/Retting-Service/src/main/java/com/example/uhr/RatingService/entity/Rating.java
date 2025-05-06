package com.example.uhr.RatingService.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//@Document(collection = "rating")
@Entity(name = "Ratings")
public class Rating {
	
	@Id
	private Long ratingId;
	
//	@Field(name = "user_id")
	@Column(name = "user_id")
	private Long userId;
	
//	@Field(name = "hotel_id")
	@Column(name = "hotel_id")
	private Long hotelId;
	
//	@Field(name = "rating")
	@Column(name = "rating")
	private int rating;
	
//	@Field(name = "feedback")
	@Column(name = "feedback")
	private String feedback;
	

}
