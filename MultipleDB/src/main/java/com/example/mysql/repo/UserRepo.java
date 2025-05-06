package com.example.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
