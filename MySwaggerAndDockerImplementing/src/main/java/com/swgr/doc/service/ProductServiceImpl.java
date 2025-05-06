package com.swgr.doc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swgr.doc.entity.Product;
import com.swgr.doc.exception.ResourceNotFoundException;
import com.swgr.doc.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product CreateProduct(Product product) {

		return productRepo.save(product);
	}

	@Override
	public com.swgr.doc.entity.Product getProductById(Long id) {
		Optional<Product> product = productRepo.findById(id);
		if(product.isPresent()) {
			return product.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : "+id);
		}
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Product updateProduct(Product product, Long id) {
		Optional<Product> productdb = productRepo.findById(id);
		if(productdb.isPresent()) {
			Product productUpdate = productdb.get();
			productUpdate.setName(product.getName());
			productUpdate.setDescription(product.getDescription());
			productUpdate.setPrice(product.getPrice());
			return productRepo.save(productUpdate);
		} else {
			throw new ResourceNotFoundException("Record not found with id : "+id);
		}
	}

	@Override
	public void deleteProduct(Long id) {
		Optional<Product> product = productRepo.findById(id);
		if(product.isPresent()) {
			productRepo.deleteById(id);
		} else {
			throw new ResourceNotFoundException("Record not found with id : "+id);
		}
	}

}
