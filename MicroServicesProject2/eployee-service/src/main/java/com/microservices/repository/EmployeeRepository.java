package com.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	@Query("SELECT e FROM Employee e WHERE e.departmentId = :departmentId")
    List<Employee> findByDepartment(@Param("departmentId") Long departmentId);

}
