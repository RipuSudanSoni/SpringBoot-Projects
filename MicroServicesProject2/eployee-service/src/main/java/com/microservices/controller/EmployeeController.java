package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entity.Employee;
import com.microservices.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		System.out.println("Emp Object comming from UI :::::::- "+employee);
		Employee savedEmp = employeeRepository.save(employee);
		System.out.println("Emp Object comming from DB :::::::- "+savedEmp);
		return new ResponseEntity<Employee>(savedEmp, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
		Employee emp = employeeRepository.findById(id).orElseThrow();
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> allEmp = employeeRepository.findAll();
		return new ResponseEntity<List<Employee>>(allEmp, HttpStatus.OK);
	}
	
	@GetMapping("/department/{departmentId}")
	public ResponseEntity<List<Employee>> findByDepartment(@PathVariable("departmentId") Long departmentId) {
		List<Employee> allEmp = employeeRepository.findByDepartment(departmentId);
		return new ResponseEntity<List<Employee>>(allEmp, HttpStatus.OK);
	}
	
}
