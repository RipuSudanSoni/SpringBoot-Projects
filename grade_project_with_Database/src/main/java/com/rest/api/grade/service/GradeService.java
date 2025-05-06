package com.rest.api.grade.service;

import org.springframework.stereotype.Service;

import com.rest.api.grade.entity.Grade;

@Service
public interface GradeService {

	public Grade getGrade();
	
}
