package com.example.demo.Example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Example.entity.Employee;
import com.example.demo.Example.services.EmpService;

@RestController
@RequestMapping("/emp")
public class EmployeController {

	
	@Autowired
	private EmpService empService;
	
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee emp) {
		
		return empService.saveEmp(emp);
		
	}
	
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmp();
		
	}
}
