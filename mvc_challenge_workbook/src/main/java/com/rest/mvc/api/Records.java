package com.rest.mvc.api;

import java.math.BigDecimal;

public class Records {

	private String item;
	private double revenue;
	private double cost;
	
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Records() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Records(String item, Double revenue, double cost) {
		super();
		this.item = item;
		this.revenue = revenue;
		this.cost = cost;
	}
	
	
}
