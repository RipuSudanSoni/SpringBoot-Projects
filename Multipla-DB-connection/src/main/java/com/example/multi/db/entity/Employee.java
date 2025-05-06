package com.example.multi.db.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "date_of_joining")
	private Date doj;
	
	@Column(name = "dept_id")
	private int deptId;
}
