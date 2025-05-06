package com.rest.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.project.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
	
	public Optional<User> findByEmailAndPassword(String email, String password);
}
