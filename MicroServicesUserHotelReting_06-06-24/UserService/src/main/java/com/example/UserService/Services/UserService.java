package com.example.UserService.Services;

import java.util.List;

import com.example.UserService.Entity.User;

public interface UserService {
	
	//create
	User createUser(User user);
	
	//getAll
	List<User> getAllUser();
	
	//getById
	User getUserById(Long userId);

	
	// TODO: update
	// TODO: delete
}
