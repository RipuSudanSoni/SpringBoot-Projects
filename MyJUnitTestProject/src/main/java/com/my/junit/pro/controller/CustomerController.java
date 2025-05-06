package com.my.junit.pro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.junit.pro.Exception.ResourceNotFoundException;
import com.my.junit.pro.entity.Customer;
import com.my.junit.pro.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/rest/api/create/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		Customer createdCustomer = customerService.createCustomer(customer);
		return new ResponseEntity<Customer>(createdCustomer, HttpStatus.CREATED);
	}
	
	@GetMapping("/rest/api/get/customer/{customerId}")
	public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable Long customerId) throws ResourceNotFoundException {
		Optional<Customer> customer = customerService.getCustomer(customerId);
		return new ResponseEntity<Optional<Customer>>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/rest/api/get/customer/byEmail")
	public ResponseEntity<List<Customer>> getCustomerByEmail(@RequestParam String email) throws ResourceNotFoundException {
		List<Customer> allCustomer = customerService.getCustomerByEmail(email);
		return new ResponseEntity<List<Customer>>(allCustomer, HttpStatus.OK);
	}
	
	@GetMapping("/rest/api/get/Allcustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		List<Customer> allCustomer = customerService.getAllCustomer();
		return new ResponseEntity<List<Customer>>(allCustomer, HttpStatus.OK);
	}
	
	@PutMapping("/rest/api/update/customer/{customerId}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable Long customerId) throws ResourceNotFoundException {
		Customer updatedCustomer = customerService.updateCustomer(customer, customerId);
		return new ResponseEntity<Customer>(updatedCustomer, HttpStatus.OK);
	}
	
	@DeleteMapping("/rest/api/delete/customer/{customerId}")
	public String deleteCustomer(@PathVariable Long customerId) {
		return customerService.deleteCustomer(customerId);
	}
}
