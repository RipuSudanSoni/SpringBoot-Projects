package com.mydemo.pro.productservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "product")
public class Product {

	@Id
	private String proId;
	private String name;
	private String description;
	private BigDecimal price;
}
