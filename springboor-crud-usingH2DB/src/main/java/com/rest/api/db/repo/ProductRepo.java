package com.rest.api.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.db.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
