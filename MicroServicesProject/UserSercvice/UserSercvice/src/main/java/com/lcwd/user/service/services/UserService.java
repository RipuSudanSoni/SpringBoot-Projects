package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entity.User;

public interface UserService {
	
	public User createUser(User user);
	
	public User getUserById(Long id);
	
	public List<User> getAllUser();
	
	public User updateUser(User user, Long id);
	
	public void deleteUser(Long id);

}
