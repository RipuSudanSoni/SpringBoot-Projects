package com.lcwd.user.service.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.user.service.entity.Hotel;
import com.lcwd.user.service.entity.Rating;
import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.externalsServices.HotelService;
import com.lcwd.user.service.repository.UserRepository;

import exception.ResourseNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private HotelService hotelService;
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(Long id) {
		// get user from database with the help of user repository
		User user = userRepo.findById(id).orElseThrow(() -> new ResourseNotFoundException("User Not found with id : "+id));
		
		// api call to RatingService to get the Rating
		Rating[] ratingsOfUser = restTemplate.getForObject("http://RATING-SERVICE/rest/api/rating/get/byUserId/"+user.getUserId(), Rating[].class);
		logger.info("Logger msg for Rating from UserService :- "+ratingsOfUser);
		
		List<Rating> ratinds = Arrays.stream(ratingsOfUser).toList();
		
		List<Rating> ratingList = ratinds.stream().map(rating -> {
			// api call to hotelService to get the Hotel
			
//			ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/rest/api/get/hotel/"+rating.getHotelId(), Hotel.class);
//			Hotel hotel = forEntity.getBody();
			
			Hotel hotel = hotelService.getHotelById(rating.getHotelId());      // communication one service to another service through FeignClients
			logger.info("Logger msg for Hotel from UserService :- "+hotel);
			
			//set the hotel to reting
			rating.setHotel(hotel);
			//return the rating
			return rating;
		}).collect(Collectors.toList());
		
		user.setRatings(ratingList);
		
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user, Long id) {
		User preUser = userRepo.findById(id).orElseThrow(() -> new ResourseNotFoundException("User Not found with id : "+id));
		preUser.setUserId(user.getUserId());
		preUser.setName(user.getName());
		preUser.setEmail(user.getEmail());
		preUser.setAbout(user.getAbout());
		return userRepo.save(preUser);
	}

	@Override
	public void deleteUser(Long id) {
		User user = userRepo.findById(id).orElseThrow(() -> new ResourseNotFoundException("User Not found with id : "+id));
		userRepo.delete(user);
	}
	
}
