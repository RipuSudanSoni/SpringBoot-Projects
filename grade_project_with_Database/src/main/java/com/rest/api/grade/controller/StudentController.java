package com.rest.api.grade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.grade.entity.Student;
import com.rest.api.grade.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create/student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student createStudent = studentService.createStudent(student);
		return new ResponseEntity<Student>(createStudent, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {
		Student student = studentService.getStudent(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@GetMapping("/getAll/student")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> allStudents = studentService.getAllStudentts();
		return new ResponseEntity<List<Student>>(allStudents, HttpStatus.OK);
	}
}
