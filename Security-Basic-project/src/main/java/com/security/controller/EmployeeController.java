package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.security.entity.Employee;
//import com.security.repo.EmployeeRepo;

@RestController
@RequestMapping("/msg")
public class EmployeeController {
	
  @GetMapping("/admin/msg")
  @PreAuthorize("hasRole('ADMIN')")
  public String getAdminMsg() {
		return "This Api is Access By Admin Only.";
	}
  
  
  @GetMapping("/user/msg")
  @PreAuthorize("hasRole('USER')")
  public String getUserMsg() {
		return "This Api is Access By User Only.";
	}
	
	
//	@Autowired
//    private EmployeeRepo employeeRepo;
//	
//	
//	@GetMapping("/welcome")
//    public String welcome() {
//        return "Welcome to our employee portal";
//        
//    }
//	
//	@GetMapping("/allemp")
//    @PreAuthorize("hasRole('ADMIN')")
//    public List<Employee> getEmployee() {
//        return employeeRepo.findAll();
//
//    }
//	
//	@GetMapping("/user")
//    public String userAccess() {
//        return "This is Secure user ";
//    }
//
//    @PostMapping("/saveemp")
//    @PreAuthorize("hasRole('USER')")
//    public Employee saveEmployee(@RequestBody Employee employee) {
//        return employeeRepo.saveAndFlush(employee);
//    }
//    
//    @DeleteMapping("/delemp")
//    public void deleteEmployee(@PathVariable Long id) {
//        employeeRepo.deleteById(id);
//    }
//
//    @PutMapping("/employee/{id}")
//    public Employee replaceEmployee(@RequestBody Employee employee, @PathVariable Long id) {
//
//        Employee PreEmployee = employeeRepo.findById(id).get();
//        PreEmployee.setName(employee.getName());
//        // Preemployee.setDate(order.getDate());
//        PreEmployee.setEmail(employee.getEmail());
//        PreEmployee.setAddress(employee.getAddress());
//        Employee savedEmployee = employeeRepo.save(PreEmployee);
//
//        return savedEmployee;
//
//    }
    

}
