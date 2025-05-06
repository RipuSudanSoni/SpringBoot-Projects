package com.lcwd.user.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.sym.Name;
import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.services.UserService;
import com.lcwd.user.service.services.UserServiceImpl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/rest/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/create")
	public ResponseEntity<User> creatUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}

	int retryCount = 1;
	
	@GetMapping("/get/user/{id}")
//	@CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelfallback")
	@Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelfallback")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		logger.info("Retry count {}",retryCount);
		retryCount++;
		User user = userService.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	// craeting fallback method for circuitbreaker
	public ResponseEntity<User> ratingHotelfallback(Long id, Exception ex) {
		logger.info("fallback is executed because service is down :", ex.getMessage());
		User user = User.builder().email("dummy@gmail.com")
					 .name("Dummy")
					 .about("This is user created dummy because some service is down.")
					 .build();
					 
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping("/getAll/user")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> allUser = userService.getAllUser();
		return new ResponseEntity<List<User>>(allUser, HttpStatus.OK);
	}
	
	@PutMapping("/update/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
		User updatedUser = userService.updateUser(user, id);
		return new ResponseEntity<User>(updatedUser, HttpStatus.OK);
	}
		
}
