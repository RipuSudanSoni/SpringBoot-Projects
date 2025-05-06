//package com.security.entity;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Department {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	private String name;
//	private String deptType;
//	private String functonality;
//	
//	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
//	@JoinColumn(name="department_id")
//	private List<Employee> employees;
//
//	public Department() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Department(Long id, String name, String deptType, String functonality, List<Employee> employees) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.deptType = deptType;
//		this.functonality = functonality;
//		this.employees = employees;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDeptType() {
//		return deptType;
//	}
//
//	public void setDeptType(String deptType) {
//		this.deptType = deptType;
//	}
//
//	public String getFunctonality() {
//		return functonality;
//	}
//
//	public void setFunctonality(String functonality) {
//		this.functonality = functonality;
//	}
//
//	public List<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
//
//
//	
//}
//
