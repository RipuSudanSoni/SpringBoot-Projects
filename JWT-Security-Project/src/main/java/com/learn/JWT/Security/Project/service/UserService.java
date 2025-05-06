package com.learn.JWT.Security.Project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.learn.JWT.Security.Project.models.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();
	
	public UserService() {
		list.add(new User("abc", "abc", "abc@gmail.com"));
		list.add(new User("xyz", "abcxyz", "xyz@gmail.com"));
	}
	
	
	// get all user
	public List<User> getAll() {
		return this.list;
	}
	
	// get single user
	public User getUser(String userName) {
		User user = list.stream().filter(u -> u.getUserName().equalsIgnoreCase(userName)).findAny().get();
		return user;
	}
	
	// add new User
	public User addUser(User user) {
		list.add(user);
		return user;
	}
	
	
}











