package com.swgr.doc.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.swgr.doc.entity.Product;

public interface ProductRepo extends MongoRepository<Product, Long>{

}
