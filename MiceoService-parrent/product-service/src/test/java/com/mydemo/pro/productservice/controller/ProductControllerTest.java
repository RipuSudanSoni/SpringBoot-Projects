package com.mydemo.pro.productservice.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//import com.my.junit.pro.controller.CustomerController;
import com.mydemo.pro.productservice.Dto.ProductRequest;
import com.mydemo.pro.productservice.Dto.ProductResponse;
import com.mydemo.pro.productservice.service.ProductService;

//@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(value = ProductController.class)
public class ProductControllerTest {

	    @Mock
	    private ProductService productService;

	    @InjectMocks
	    private ProductController productController;

//	    @BeforeAll
//	    public void setup() {
//	        MockitoAnnotations.initMocks(this);
//	    }

	    @Test
	    public void createProductTest() {
	        ProductRequest productRequest = new ProductRequest();
	        productRequest.setName("Product 1");
	        productRequest.setDescription("Description 1");

	        ProductResponse productResponse = new ProductResponse();
	        productResponse.setProId("123");
	        productResponse.setName("Product 1");
	        productResponse.setDescription("Description 1");

	        when(productService.createProduct(productRequest)).thenReturn(productResponse);

	        ResponseEntity<ProductResponse> response = productController.createProduct(productRequest);

	        assertEquals(HttpStatus.CREATED, response.getStatusCode());
	        assertEquals(productResponse, response.getBody());
	    }

	    @Test
	    public void getAllProductTest() {
	        List<ProductResponse> allProducts = new ArrayList<>();
	        ProductResponse productResponse1 = new ProductResponse();
	        productResponse1.setProId("123");
	        productResponse1.setName("Product 1");
	        productResponse1.setDescription("Description 1");

	        ProductResponse productResponse2 = new ProductResponse();
	        productResponse2.setProId("456");
	        productResponse2.setName("Product 2");
	        productResponse2.setDescription("Description 2");

	        allProducts.add(productResponse1);
	        allProducts.add(productResponse2);

	        when(productService.getAllProducts()).thenReturn(allProducts);

	        ResponseEntity<List<ProductResponse>> response = productController.getAllProduct();

	        assertEquals(HttpStatus.OK, response.getStatusCode());
	        assertEquals(allProducts, response.getBody());
	    }

	    @Test
	    public void getProductTest() {
	        String proId = "123";
	        ProductResponse productResponse = new ProductResponse();
	        productResponse.setProId(proId);
	        productResponse.setName("Product 1");
	        productResponse.setDescription("Description 1");

	        when(productService.getProductById(proId)).thenReturn(productResponse);

	        ResponseEntity<ProductResponse> response = productController.getProduct(proId);

	        assertEquals(HttpStatus.OK, response.getStatusCode());
	        assertEquals(productResponse, response.getBody());
	    }
}
