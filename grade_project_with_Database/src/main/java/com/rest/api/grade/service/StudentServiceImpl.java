package com.rest.api.grade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.grade.entity.Student;
import com.rest.api.grade.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student createStudent(Student student) {
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}

	@Override
	public Student getStudent(Long Id) {
		Student student = studentRepo.findById(Id).get();
		return student;
	}

	@Override
	public List<Student> getAllStudentts() {
		List<Student> studentList = studentRepo.findAll();
		return studentList;
	}

	@Override
	public Student updaStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student deleteStudent(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
