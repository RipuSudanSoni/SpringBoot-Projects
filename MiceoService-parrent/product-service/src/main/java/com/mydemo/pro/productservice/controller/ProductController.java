package com.mydemo.pro.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydemo.pro.productservice.Dto.ProductRequest;
import com.mydemo.pro.productservice.Dto.ProductResponse;
import com.mydemo.pro.productservice.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
		ProductResponse productResponse = productService.createProduct(productRequest);
		return new ResponseEntity<ProductResponse>(productResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<ProductResponse>> getAllProduct() {
		List<ProductResponse> allProducts = productService.getAllProducts();
		return new ResponseEntity<List<ProductResponse>>(allProducts, HttpStatus.OK);
	}
	
	@GetMapping("/get/{proId}")
	public ResponseEntity<ProductResponse> getProduct(@PathVariable String proId) {
		ProductResponse productResponse = productService.getProductById(proId);
		return new ResponseEntity<ProductResponse>(productResponse, HttpStatus.OK);
	}
}
