package com.lcwd.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.repository.ratingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private ratingRepository ratingRepo;
	

	@Override
	public Rating createRating(Rating rating) {
		
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(Long userId) {
		List<Rating> ratingsByUser = ratingRepo.findByUserId(userId);
		return ratingsByUser;
	}

	@Override
	public List<Rating> getRatingByHolelId(Long hotelId) {
		List<Rating> ratingByHotel = ratingRepo.findByHotelId(hotelId);
		return ratingByHotel;
	}

}
