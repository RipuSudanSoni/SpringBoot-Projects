package com.example.uhr.RatingService.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uhr.RatingService.Repository.RatingRepo;
import com.example.uhr.RatingService.entity.Rating;
import com.example.uhr.RatingService.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepo ratingRepo;

	@Override
	public Rating createRating(Rating rating) {
		Rating savedRating = ratingRepo.save(rating);
		return savedRating;
	}

	@Override
	public List<Rating> getAllRating() {
		System.out.println(">>>>>>>>>>>>>222222>>>>> = "+ratingRepo.findAll());
		return ratingRepo.findAll();
		
	}
	
//	@Override
//	public List<Rating> findRatingByUserId(Long userId) {
//		return ratingRepo.findByUserId(userId);
//	}

//	@Override
//	public List<Rating> findRatingByHotelId(Long hotelId) {
//		return ratingRepo.findByHotelId(hotelId);
//	}

	@Override
	public Rating updateRating(Long ratingId, Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRating(Long ratingId) {
		// TODO Auto-generated method stub
		return null;
	}

}
