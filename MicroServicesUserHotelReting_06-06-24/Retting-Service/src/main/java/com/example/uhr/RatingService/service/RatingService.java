package com.example.uhr.RatingService.service;

import java.util.List;

import com.example.uhr.RatingService.entity.Rating;

public interface RatingService {

	
	public Rating createRating(Rating rating);
	
	public List<Rating> getAllRating();
	
	public List<Rating> findRatingByUserId(Long userId);
	
	public List<Rating> findRatingByHotelId(Long hotelId);
	
	public Rating updateRating(Long ratingId, Rating rating);
	
	public String deleteRating(Long ratingId);
}
