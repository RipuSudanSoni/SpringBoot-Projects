package com.security.myjwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.myjwt.entity.MyUser;
import com.security.myjwt.entity.Product;
import com.security.myjwt.service.MyUserService;
import com.security.myjwt.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private MyUserService myUserService;
	
	@GetMapping(value = "/welcome")
	public String getWelcomeMsg() {
		return "Welcome to you on my site.";
	}
	
	@PostMapping("/create/user")
	public String addNewUser(@RequestBody MyUser myUser) {
		return myUserService.createUser(myUser);
	}
	
	@GetMapping("/get/{proId}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<Product> getProduct(@PathVariable Long proId) throws Exception {
		Product product = productService.getProduct(proId);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
	}
	
	@GetMapping("/get/all")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> allProducts = productService.getAllProducts();
		return new ResponseEntity<List<Product>>(allProducts, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product createdProduct = productService.createProduct(product);
		return new ResponseEntity<Product>(createdProduct, HttpStatus.CREATED);
	}

}
