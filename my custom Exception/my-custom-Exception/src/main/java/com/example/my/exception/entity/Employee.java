package com.example.my.exception.entity;


public class Employee {
	
	private int id;
	private String empName;
	private double sal;
	private int age;
	private String gender;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empName, double sal, int age, String gender) {
		super();
		this.id = id;
		this.empName = empName;
		this.sal = sal;
		this.age = age;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", sal=" + sal + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	

}
