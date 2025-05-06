package com.example.demo.Example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Example.entity.Employee;



@Repository
public interface EmpRepo extends JpaRepository<Employee, Long>{

}
