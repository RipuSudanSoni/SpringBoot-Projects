package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
