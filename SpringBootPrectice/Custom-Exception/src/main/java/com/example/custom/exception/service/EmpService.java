package com.example.custom.exception.service;

import org.springframework.stereotype.Service;

import com.example.custom.exception.customException.EmpNotFoundException;
import com.example.custom.exception.entity.Employee;

@Service
public class EmpService {

	
	public Employee getEmpById(int id) throws EmpNotFoundException {
		if(id== 101) {
			return new Employee(101, "Golu", "golu@gmail.com");
		}
		else {
				throw new EmpNotFoundException("Emp Not found Exception with given Id");
			}
		}
	}

