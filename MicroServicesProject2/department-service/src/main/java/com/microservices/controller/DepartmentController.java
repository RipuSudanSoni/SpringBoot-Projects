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

import com.microservices.entity.Department;
import com.microservices.externalClientServices.EmployeeClient;
import com.microservices.repository.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private EmployeeClient employeeClient;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@PostMapping("/create")
	public ResponseEntity<Departmen Build a Struts application that uses Struts tags to implement web forms.mt> addDepartment(@RequestBody Department department) {
		Department createdDepartment = departmentRepository.save(department);
		return new ResponseEntity<Department>(createdDepartment, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Department> getDepartment(@PathVariable("id") Long id) {
		Department department = departmentRepository.findById(id).orElseThrow();
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Department>> getAllDepartment() {
		List<Department> allDepartment = departmentRepository.findAll();
		return new ResponseEntity<List<Department>>(allDepartment, HttpStatus.OK);
	}
	
	@GetMapping("/getAll/with-employees")
	public ResponseEntity<List<Department>> FindAllDepartmentWithEmployees() {
		List<Department> allDepartments = departmentRepository.findAll();
		
		allDepartments.forEach(department -> department.setEmployees(employeeClient.findByDepartment(department.getId())));
		
		return new ResponseEntity<List<Department>>(allDepartments, HttpStatus.OK);
	}
	
}
