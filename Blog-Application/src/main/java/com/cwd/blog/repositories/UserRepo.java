package com.cwd.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwd.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
