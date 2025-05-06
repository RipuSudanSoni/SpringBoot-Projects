package com.swgr.doc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swgr.doc.entity.Product;
import com.swgr.doc.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/rest/api/create/product", method = RequestMethod.POST)
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product createdProduct = productService.CreateProduct(product);
		return new ResponseEntity<Product>(createdProduct, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/rest/api/get/product/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
		Product product = productService.getProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/rest/api/get/allproduct", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> allProduct = productService.getAllProduct();
		return new ResponseEntity<List<Product>>(allProduct, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/rest/api/update/product/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable Long id) {
		Product updatedProduct = productService.updateProduct(product, id);
		return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/rest/api/delet/product/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteProductById(@PathVariable Long id) {
		productService.deleteProduct(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
	}
	
}