package com.example.uhr.RatingService.controllers;

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
import com.example.uhr.RatingService.entity.Rating;
import com.example.uhr.RatingService.service.RatingService;

@RestController
@RequestMapping("/api/v1/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		Rating createdRating = ratingService.createRating(rating);
		return new ResponseEntity<Rating>(createdRating, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Rating>> getAllRatings() {
		List<Rating> ratingsList =  ratingService.getAllRating();
		return new ResponseEntity<List<Rating>>(ratingsList, HttpStatus.OK);
	}
	
	@GetMapping("/by/userId/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable Long userId) {
		List<Rating> ratingsList =  ratingService.findRatingByUserId(userId);
		return new ResponseEntity<List<Rating>>(ratingsList, HttpStatus.OK);
	}
	
	@GetMapping("/by/hotelId/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable Long hotelId) {
		List<Rating> ratingsList =  ratingService.findRatingByHotelId(hotelId);
		return new ResponseEntity<List<Rating>>(ratingsList, HttpStatus.OK);
	}
	
	
	

}
