package com.security.myjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.myjwt.entity.MyUser;

public interface MyUserRepo extends JpaRepository<MyUser, Long>{

	Optional<MyUser> findByuserName(String username);

}
