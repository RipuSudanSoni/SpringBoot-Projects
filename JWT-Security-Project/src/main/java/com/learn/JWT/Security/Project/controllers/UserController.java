package com.learn.JWT.Security.Project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.learn.JWT.Security.Project.models.User;
import com.learn.JWT.Security.Project.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	// get all user
	@GetMapping("/")
	public List<User> getAllUsers() {
		return userService.getAll();
	}
	
	// get single
	@GetMapping("/{userName}")
	public User getUserById(@PathVariable String userName) {
		return userService.getUser(userName);
	}
	
	// add New User
	@PostMapping("/add")
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
}
