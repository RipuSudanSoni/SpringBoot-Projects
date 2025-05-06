package com.validate.hiber.Validation.Using.Hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.validate.hiber.Validation.Using.Hibernate.Repo.UserRepository;
import com.validate.hiber.Validation.Using.Hibernate.entity.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private UserRepository userRepository;
	
	public UserController(UserRepository userRepository2) {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/create")
    public User createUsers(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/getById/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

}

