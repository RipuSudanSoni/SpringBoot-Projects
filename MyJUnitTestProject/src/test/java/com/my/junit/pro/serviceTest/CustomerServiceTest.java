package com.my.junit.pro.serviceTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.my.junit.pro.Exception.ResourceNotFoundException;
import com.my.junit.pro.entity.Customer;
import com.my.junit.pro.repo.CustomerRepo;
import com.my.junit.pro.service.CustomerServiceImpl;


@SpringBootTest
public class CustomerServiceTest {
	
	@Mock
	private CustomerRepo customerRepo;
	
	@InjectMocks
	private CustomerServiceImpl customerService;

	
	@Test
	public void getCustomerTest() throws Exception {
		Long id = 6L;
		Optional<Customer> customer = Optional.of(new Customer(6L, "Rohit", "rohit@gmail.com","Hyd","987654345"));
		when(customerRepo.findById(id)).thenReturn(customer);
		Optional<Customer> newCustomer = customerService.getCustomer(id);
		assertEquals(newCustomer, customer);
	}
	
	@Test
	public void getCustomerExceptionTest() throws Exception {
		Long id = 100L;
		Optional<Customer> customer = Optional.of(new Customer(6L, "Rohit", "rohit@gmail.com","Hyd","987654345"));
		String msg = "Customer not found with id :+id";
		when(customerRepo.findById(id)).thenThrow(ResourceNotFoundException.class);
		Optional<Customer> newCustomer = customerService.getCustomer(id);
		assertEquals(newCustomer, msg);
	}

	@Test
	public void getAllCustomer() {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765"));
		list.add(new Customer(7L,"Hemant","hemant@gmail.com", "Chennai", "9876543432"));
		
		when(customerRepo.findAll()).thenReturn(list);
		
		List<Customer> allCustomer = customerService.getAllCustomer();
		assertEquals(allCustomer, list);
		assertThat(customerService.getAllCustomer()).hasSize(2);
	}
	
	@Test
	public void getCustomerByEmail() throws Exception {
		String email = "mohit@gmail.com";
		List<Customer> customers = Arrays.asList(new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765"));
		when(customerRepo.findByEmail(email)).thenReturn(customers);
		
		List<Customer> customerByEmail = customerService.getCustomerByEmail(email);
		assertEquals(customers, customerByEmail);
		
	}
	
	@Test
	public void createCustomer() {
		Customer customer = new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765");
		when(customerRepo.save(customer)).thenReturn(customer);
		
		Customer createdCustomer = customerService.createCustomer(customer);
		assertEquals(customer, createdCustomer);
	}

//	@Test
//	public void updateCustomer() {
//		long customerId = 3L;
//		Customer customer = new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765");
//		when(customerRepo.findById(customerId)).thenReturn(customer);
//	}
	
	
//	@Test
//	public void deleteCustomer() {
//		long customerId = 3L;
//		when(customerRepo.deleteById(2L)).thenReturn("delete success fully");
//	}
	
	

}
