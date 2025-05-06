package com.lcwd.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.service.RatingService;

@RestController
@RequestMapping("/rest/api/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping(value = "/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		
		Rating createdRating = ratingService.createRating(rating);
		return new ResponseEntity<Rating>(createdRating, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<List<Rating>> getAllRatings() {
		 List<Rating> allRatings = ratingService.getAllRatings();
		 return new ResponseEntity<List<Rating>>(allRatings, HttpStatus.OK);
	}
	
	@GetMapping("/get/byUserId/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable Long userId) {
		List<Rating> ratings = ratingService.getRatingByUserId(userId);
		return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
	}
	
	@GetMapping("/get/byhotelId/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable Long hotelId) {
		List<Rating> ratings = ratingService.getRatingByHolelId(hotelId);
		return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
	}
}
