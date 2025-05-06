package com.security.myjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.myjwt.entity.MyUser;
import com.security.myjwt.repository.MyUserRepo;

@Service
public class MyUserService {

	@Autowired
	private MyUserRepo myUserRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public String createUser(MyUser myUser) {
		myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
		myUserRepo.save(myUser);
		return "User Created Successfully !!";
	}
}
