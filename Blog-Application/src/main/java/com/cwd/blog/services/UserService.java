package com.cwd.blog.services;

import java.util.List;

import com.cwd.blog.payload.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto getUserById(Long userId);
	List<UserDto> getAllUser();
	UserDto updateUser(UserDto userDto, Long userId);
	void deleteUser(Long userId);
}
