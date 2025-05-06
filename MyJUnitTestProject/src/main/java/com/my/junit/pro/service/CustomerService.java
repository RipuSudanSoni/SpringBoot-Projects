package com.my.junit.pro.service;

import java.util.List;
import java.util.Optional;

import com.my.junit.pro.Exception.ResourceNotFoundException;
import com.my.junit.pro.entity.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	
	public Optional<Customer> getCustomer(Long customerId) throws ResourceNotFoundException;
	
	public List<Customer> getCustomerByEmail(String email) throws ResourceNotFoundException;
	
	public List<Customer> getAllCustomer();
	
	public Customer updateCustomer(Customer customer, Long customerId) throws ResourceNotFoundException;
	
	public String deleteCustomer(Long customerId);

}
