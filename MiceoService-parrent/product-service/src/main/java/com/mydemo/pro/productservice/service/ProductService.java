package com.mydemo.pro.productservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydemo.pro.productservice.Dto.ProductRequest;
import com.mydemo.pro.productservice.Dto.ProductResponse;
import com.mydemo.pro.productservice.model.Product;
import com.mydemo.pro.productservice.repo.ProductRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ProductResponse createProduct(ProductRequest productRequest) {
		Product product = modelMapper.map(productRequest, Product.class);
		Product savedProduct = productRepo.save(product);
		log.info("Product {} is saved....",product.getProId());
		return modelMapper.map(savedProduct, ProductResponse.class);
		
	}

	public List<ProductResponse> getAllProducts() {
		List<Product> products = productRepo.findAll();
		List<ProductResponse> productResponses = products.stream().map(prd -> modelMapper.map(prd, ProductResponse.class)).collect(Collectors.toList());
		log.info("All products are :- {}",productResponses);
		return productResponses;
	}

	public ProductResponse getProductById(String proId) {
		Product product = productRepo.findById(proId).orElseThrow(null);
		ProductResponse productResponse = modelMapper.map(product, ProductResponse.class);
		log.info("product with id {}, is :- {}",proId, productResponse);
		return productResponse;
		
	}
}
