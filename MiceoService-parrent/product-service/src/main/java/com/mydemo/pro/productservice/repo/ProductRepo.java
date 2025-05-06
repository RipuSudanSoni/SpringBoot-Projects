package com.mydemo.pro.productservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mydemo.pro.productservice.model.Product;

public interface ProductRepo extends MongoRepository<Product, String>{

}
