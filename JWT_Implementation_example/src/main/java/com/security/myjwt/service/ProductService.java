package com.security.myjwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.myjwt.entity.Product;
import com.security.myjwt.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	public Product getProduct(Long proId) throws Exception {
		Product product = productRepo.findById(proId).orElseThrow(() -> new Exception("Product id "+proId+" not found"));
		return product;
	}
	
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}
	
}
