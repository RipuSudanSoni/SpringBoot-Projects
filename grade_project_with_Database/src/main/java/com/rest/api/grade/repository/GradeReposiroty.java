package com.rest.api.grade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.grade.entity.Grade;

public interface GradeReposiroty extends JpaRepository<Grade, Long>{

}
