package com.security.myjwt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.security.myjwt.config.MyUserUserDetails;
import com.security.myjwt.entity.MyUser;
import com.security.myjwt.repository.MyUserRepo;

public class MyUserUserDeatilsService implements UserDetailsService{
	
	@Autowired
	private MyUserRepo myUserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<MyUser> myUser = myUserRepo.findByuserName(username);
		MyUserUserDetails myUserDetails = myUser.map(MyUserUserDetails :: new).orElseThrow(() -> new UsernameNotFoundException("User Not founf "+username));
		return myUserDetails;
	}

}
