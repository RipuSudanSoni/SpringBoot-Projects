package com.security.myjwt.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.myjwt.entity.MyUser;

public class MyUserUserDetails implements UserDetails{
	
	private String userName;
	private String pwd;
	private List<GrantedAuthority> authorities;   // this is for may be one user have multiple roles that's why ok.
	
	
	public MyUserUserDetails(MyUser myUser) {
		userName = myUser.getUserName();
		pwd = myUser.getPassword();
		authorities = Arrays.stream(myUser.getRoles().split(","))
						.map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {	
		return pwd;
	}

	@Override
	public String getUsername() {
		
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
