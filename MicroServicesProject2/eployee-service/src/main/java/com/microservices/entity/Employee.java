package com.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int age;
	
	private String position;
	
	private Long departmentId;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Long id, String name, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
	}

	public Employee(Long id, String name, int age, String position, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.position = position;
		this.departmentId = departmentId;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + ", departmentId="
				+ departmentId + "]";
	}
	
	

}
