package com.my.junit.pro.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.junit.pro.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	public List<Customer> findByEmail(String email);

}
