package com.rest.api.db.service;

import java.util.List;

import com.rest.api.db.entity.Product;

public interface ProductService {

	public Product CreateProduct(Product product);
	
	public Product getProductById(Long id);
	
	public List<Product> getAllProduct();
	
	public Product updateProduct(Product product, Long id);
	
	public void deleteProduct(Long id);
}
