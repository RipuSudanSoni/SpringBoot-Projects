package com.rest.api.grade.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.api.grade.entity.Student;

@Service
public interface StudentService {

	public Student createStudent(Student student);
	
	public Student getStudent(Long Id);
	
	public List<Student> getAllStudentts();
	
	public Student updaStudent(Long id, Student student);
	
	public Student deleteStudent(Long id);
	
	
}
