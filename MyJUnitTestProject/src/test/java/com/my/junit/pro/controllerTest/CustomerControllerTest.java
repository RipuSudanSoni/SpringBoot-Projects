package com.my.junit.pro.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.junit.pro.Exception.ResourceNotFoundException;
import com.my.junit.pro.controller.CustomerController;
import com.my.junit.pro.entity.Customer;
import com.my.junit.pro.repo.CustomerRepo;
import com.my.junit.pro.service.CustomerService;

@WebMvcTest(value = CustomerController.class)
public class CustomerControllerTest {

	@MockBean
	private CustomerService customerService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getCustomer() throws Exception {
		Optional<Customer> customer = Optional.of(new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765")); 
		when(customerService.getCustomer(4L)).thenReturn(customer);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/rest/api/get/customer/5");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

	}
	
	@Test
	public void getAllCustomer() throws Exception {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765"));
		list.add(new Customer(7L,"Hemant","hemant@gmail.com", "Chennai", "9876543432"));
		when(customerService.getAllCustomer()).thenReturn(list);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/rest/api/get/Allcustomer");
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
	}
	
	@Test
	public void getCustomerByEmail() throws Exception {
		List<Customer> list = Arrays.asList(new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765"));
		String emailId = "mohit@gmail.com";
		when(customerService.getCustomerByEmail(emailId)).thenReturn(list);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/rest/api/get/customer/byEmail").param("email",emailId);
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
	}
	
	@Test
	public void createCustomer() throws Exception {
		Customer customer = new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765");
		when(customerService.createCustomer(customer)).thenReturn(customer);
		
		ObjectMapper mapper = new ObjectMapper();
		String customerJson = mapper.writeValueAsString(customer);
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/rest/api/create/customer")
															.contentType(MediaType.APPLICATION_JSON)
																.content(customerJson);
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
	}
	
	@Test
	public void updateCustomer() throws Exception {
		Customer customer = new Customer(5L,"Mohit","mohit@gmail.com", "Hyd", "876548765");
		when(customerService.updateCustomer(customer, 5L)).thenReturn(customer);
		
		ObjectMapper mapper = new ObjectMapper();
		String customerJson = mapper.writeValueAsString(mapper);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/rest/api/update/customer/5").contentType(MediaType.APPLICATION_JSON)
																			.content(customerJson);
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		
	}
	
	@Test
	public void deleteCustomer() throws Exception {
		when(customerService.deleteCustomer(2L)).thenReturn("delete success fully");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/rest/api/delete/customer/3");
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
	}
}
