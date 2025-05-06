package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entity.Rating;

public interface RatingService {

	// create
	Rating createRating(Rating rating);
	
	
	// get all ratings
	List<Rating> getAllRatings();
	
	
	// get By UserId
	List<Rating> getRatingByUserId(Long userId);
	
	
	// get By HotelId
	List<Rating> getRatingByHolelId(Long hotelId);
}
