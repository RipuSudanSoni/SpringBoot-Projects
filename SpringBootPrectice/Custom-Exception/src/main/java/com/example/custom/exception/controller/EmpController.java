package com.example.custom.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.custom.exception.customException.EmpNotFoundException;
import com.example.custom.exception.entity.Employee;
import com.example.custom.exception.service.EmpService;

@RestController
public class EmpController {

	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/api/v1/msg")
	public String getMessage() {
		return "Message from Emp controller class";
	}
	
	
	@GetMapping("/api/get/id/{id}")
	public Employee getEmpByBodyId(@PathVariable int id) {
		Employee emp;
		
		emp = empService.getEmpById(id);
    	return emp;
    	
//		try {
//			 emp = empService.getEmpById(id);
//			 return emp;
//			 
//		} catch (Exception e) {
//			throw new EmpNotFoundException("Exception from Controller class : "+e.getMessage());
//		}
//		return null;
	}
	

}
