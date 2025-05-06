package com.validate.hiber.Validation.Using.Hibernate.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validate.hiber.Validation.Using.Hibernate.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
