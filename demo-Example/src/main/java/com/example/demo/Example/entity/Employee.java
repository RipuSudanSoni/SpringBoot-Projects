package com.example.demo.Example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Employee {

	private Long id;
	private String name;
	private String department;
	private double sal;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Long id, String name, String department, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.sal = sal;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
}
