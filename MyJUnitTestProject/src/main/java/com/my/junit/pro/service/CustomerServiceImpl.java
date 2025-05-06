package com.my.junit.pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.junit.pro.Exception.ResourceNotFoundException;
import com.my.junit.pro.entity.Customer;
import com.my.junit.pro.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public Optional<Customer> getCustomer(Long customerId) throws ResourceNotFoundException {
		//Customer customer = customerRepo.findById(customerId).orElseThrow(() -> new ResourceNotFoundException("Customer not found with id :"+customerId));
		Optional<Customer> customer = customerRepo.findById(customerId);
		if(!customer.isPresent()) {
			throw( new ResourceNotFoundException("Customer not found with id :"+customerId));
		} 
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer, Long customerId) throws ResourceNotFoundException {
		Customer PreCustomer = customerRepo.findById(customerId).orElseThrow(() -> new ResourceNotFoundException("Customer not found with id :"+customerId));
		PreCustomer.setName(customer.getName());
		PreCustomer.setEmail(customer.getEmail());
		PreCustomer.setCity(customer.getCity());
		PreCustomer.setMobile(customer.getMobile());
		return customerRepo.save(PreCustomer);
	}

	@Override
	public String deleteCustomer(Long customerId) {
		customerRepo.deleteById(customerId);
		return "Delete customer sucessfully";
	}

	@Override
	public List<Customer> getCustomerByEmail(String email) throws ResourceNotFoundException {
		return customerRepo.findByEmail(email);
	}

}
