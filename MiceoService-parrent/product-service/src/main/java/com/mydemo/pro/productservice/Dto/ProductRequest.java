package com.mydemo.pro.productservice.Dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductRequest {

	private String name;
	private String description;
	private BigDecimal price;
}
