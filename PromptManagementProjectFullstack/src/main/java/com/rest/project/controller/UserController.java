package com.rest.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.project.dto.LoginDto;
import com.rest.project.model.User;
import com.rest.project.repository.UserRepo;

import Response.LoginResponse;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;

	@PostMapping("/user/signup")
	public String createUser(@RequestBody User user) {
		userRepo.save(user);
		return user.getUsername();
	}
	
	@PostMapping("/user/login")
	public LoginResponse LoginUser(@RequestBody LoginDto loginDto) {
		
		String msg = "";
		User preUser = userRepo.findByEmail(loginDto.getEmail());
		if(preUser != null) {
			String pwd = loginDto.getPassword();
			String prePwd = preUser.getPassword();
			Boolean isPwdRight = pwd.equals(prePwd);
			if(isPwdRight) {
				Optional<User> user = userRepo.findByEmailAndPassword(loginDto.getEmail(), preUser.getPassword());
				if(user.isPresent()) {
					return new LoginResponse("Login Success", true);
				}else {
					return new LoginResponse("Login Failed !", false);
				}
			} else {
				return new LoginResponse("Password Not Match ", false);
			}
		}
		else {
			return new LoginResponse("Email not Exist !",false);
		}
		
	}
	
}
