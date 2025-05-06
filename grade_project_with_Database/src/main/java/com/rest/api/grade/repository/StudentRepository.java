package com.rest.api.grade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.grade.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
