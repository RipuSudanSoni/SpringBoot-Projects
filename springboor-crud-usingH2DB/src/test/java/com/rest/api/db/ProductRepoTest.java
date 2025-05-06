package com.rest.api.db;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rest.api.db.entity.Product;
import com.rest.api.db.repo.ProductRepo;

@SpringBootTest
public class ProductRepoTest {

	@Autowired
	private ProductRepo productRepo;
	
	@Test
	public void saveProductTest() {
		Product product = new Product(3L,"Book", "Good book for programing", 1500, new Date(), new Date());
		Product savedProduct = productRepo.save(product);
		//when(productRepo.save(product)).thenReturn(product);
		System.out.println("////////////////// id = "+savedProduct.getId());
		assertThat(savedProduct.getId()).isGreaterThan(0);
	}
	
	@Test
	public void getProductById() {
		Product product = productRepo.findById(1L).get();
		System.out.println("////////////////// id = "+product.getId());
		assertThat(product.getId()).isGreaterThan(0);
	}
	
	
	
	
	
	
}
