package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.security.entity.Department;
//import com.security.repo.DepartmentRepo;

@RestController
public class DepartmentController {
	
	@GetMapping("/public/msg")
	public String getDepartment(){
	return "This message is public";
	}
	
	
	

//	@Autowired
//    private DepartmentRepo departmentRepo;
//	
//	@GetMapping("/alldept")
//	public List<Department> getDepartment(){
//	return departmentRepo.findAll();
//	}
//	 
//	@PostMapping("/savedept")
//	public Department saveDepartment(@RequestBody Department department) {
//	    return departmentRepo.save(department);
//	}
//	    
//	@DeleteMapping("remdept")
//	void deleteDepartment( @PathVariable Long Id) {
//	    departmentRepo.deleteById(Id);
//	}

}
