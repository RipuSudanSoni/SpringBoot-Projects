package com.security.myjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.myjwt.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
