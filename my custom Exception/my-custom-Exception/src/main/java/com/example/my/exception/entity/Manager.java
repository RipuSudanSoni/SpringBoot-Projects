package com.example.my.exception.entity;

public class Manager {

	private int managerId;
	private String name;
	private String department;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int managerId, String name, String department) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.department = department;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
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
	
	
	
}
