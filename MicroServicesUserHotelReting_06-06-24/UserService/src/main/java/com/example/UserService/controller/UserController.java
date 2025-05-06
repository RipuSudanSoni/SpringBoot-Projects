package com.example.UserService.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.UserService.Entity.Hotel;
import com.example.UserService.Entity.Rating;
import com.example.UserService.Entity.User;
import com.example.UserService.Services.UserService;


@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserService userService;
	
	
	private Logger logger = LoggerFactory.getLogger(User.class);

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createdUser = userService.createUser(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId){
		User user = userService.getUserById(userId);
		
		logger.info("user = {}",user.toString());
		logger.info(" ????????????? Going to retrive reting for this user id = {}",user.getUserId());
		Rating[] ratings = restTemplate.getForObject("http://localhost:8083/api/v1/ratings/by/userId/"+user.getUserId(), Rating[].class);
		
//		List<Rating> ratings = restTemplate.getForObject("http://localhost:8083/api/v1/ratings/by/userId/"+user.getUserId(), ArrayList.class);
		logger.info(">>>>>> Reting Response = {}",ratings);
		
		List<Rating> listOfRatings = new ArrayList<>(Arrays.asList(ratings));
		
		user.setRetings(listOfRatings);
		
		return new ResponseEntity<User>(user, HttpStatus.OK) ;
	}
	
	
	
//	logger.info("Reting Response = {}",ratings);
//	System.out.println(">>>>>>>>>>>>>>>>> ratings = "+ratings);
	
//	List<Rating> listOfRatings = new ArrayList<>(Arrays.asList(ratings));
//	
//	List<Rating> ratingsWithHotel = listOfRatings.stream().map(rating -> {
//	
//		Hotel hotel = restTemplate.getForObject("http://localhost:8082/api/v1/hotel/getBy/id/"+rating.getHotelId(), Hotel.class);	
//		rating.setHotel(hotel);
//		return rating;
//	}).collect(Collectors.toList());
//	
//	user.setRetings(ratingsWithHotel);
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> allUser = userService.getAllUser();
		logger.info("////////// All users = {}",allUser);
		for(User u: allUser) {
			List<Rating> ratings = restTemplate.getForObject("http://localhost:8083/api/v1/ratings/by/userId/"+u.getUserId(), ArrayList.class);
			logger.info("////////// rating for user ID = {}",u.getUserId());
			logger.info("????????? rating is {}", ratings);
		}
//		List<Rating> allRatings = restTemplate.getForObject("http://localhost:8083/api/v1/ratings/all", ArrayList.class);
//		Map<Long, List<Rating>> mapRating = new HashMap<>();
//		for(Rating rt : allRatings) {
//			mapRating.put(rt.getUserId(), new ArrayList<Rating>(rt));
//		}
		
//		System.out.println("HasMap Of Ratings :- "+mapRating);
//		logger.info("////////// All Ratings = {}",allRatings);
//		allRatings.stream().map(rating -> rating.getUserId());
		return new ResponseEntity<List<User>>(allUser, HttpStatus.OK);
	}
	
	
//	public ResponseEntity<User> update
}
