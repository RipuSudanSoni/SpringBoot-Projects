package com.example.postgresql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresql.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	Product findByName(String name);

}
