package com.rest.api.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.h2.command.dml.MergeUsing.When;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.api.db.controller.ProductController;
import com.rest.api.db.entity.Product;
import com.rest.api.db.service.ProductService;

@WebMvcTest(value = ProductController.class)
public class ProductControllerTest {
	
	@MockBean
	private ProductService productService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getByIdTest() throws Exception {
		
		String uri = "/rest/api/get/product/2";
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get(uri);
		ResultActions perform = mockMvc.perform(reqBuilder);
		 MvcResult mvcResult = perform.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
	}
	
	@Test
	public void createProductTest() throws Exception {
		Product prd = new Product("watch","fantcy watch good looking", 1200.00);
		when(productService.CreateProduct(ArgumentMatchers.any())).thenReturn(prd);
		ObjectMapper objectMapper = new ObjectMapper();
		String prdJson = objectMapper.writeValueAsString(prd);
		
		System.out.println("////////////////////////////////////");
		System.out.println("Product String : "+prdJson);
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/rest/api/create/product")
													.contentType(MediaType.APPLICATION_JSON)
													.content(prdJson);
		
		ResultActions perform = mockMvc.perform(reqBuilder);
		MvcResult andReturn = perform.andReturn();
		MockHttpServletResponse response = andReturn.getResponse();
		int status = response.getStatus();
		assertEquals(201, status);
		String contentAsString = response.getContentAsString();
		System.out.println("////////////////////////////////////");
		System.out.println("Contant String : "+contentAsString);
	}
	
	@Test
	public void getAllProductTest() throws Exception {
		String url = "/rest/api/get/allproduct";
		List<Product> list = Arrays.asList(new Product("watch","good watch",10000.00),
				new Product("Mobile","good mobile",25000.00));
		when(productService.getAllProduct()).thenReturn(list);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(url);
		MvcResult andReturn = mockMvc.perform(requestBuilder).andReturn();
		int status = andReturn.getResponse().getStatus();
		assertEquals(200, status);
		String contentAsString = andReturn.getResponse().getContentAsString();
		System.out.println("......................................");
		System.out.println("Contant String : "+contentAsString);
		
	}
	
	@Test
	public void updateProductTest() throws Exception {
		Product product = new Product("Laptop","good laptop for programing", 50000);
		when(productService.updateProduct(product, 1L)).thenReturn(product);
		product.setName("Dell Laptop");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String prdJson = objectMapper.writeValueAsString(product);
		
		String url = "/rest/api/update/product/1";
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.put(url)
													.contentType(MediaType.APPLICATION_JSON)
													.content(prdJson);
		MvcResult andReturn = mockMvc.perform(reqBuilder).andReturn();
		int status = andReturn.getResponse().getStatus();
		assertEquals(200, status);
				
	}
	
//	@Test
//	public void deleteProductTest() throws Exception {
////		String url = "/rest/api/delet/product/1";
////		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete(url);
////		MvcResult andReturn = mockMvc.perform(requestBuilder).andReturn();
////		int status = andReturn.getResponse().getStatus();
////		assertEquals(200, status);
//		 String uri = "/rest/api/delet/product/1";
//		 System.out.println("::::::::::::::::::::::::::::::::::::::");
//		   MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
//		   System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//		   int status = mvcResult.getResponse().getStatus();
//		   System.out.println("Status Code : "+status);
//		   assertEquals(200, status);
//	}
}











