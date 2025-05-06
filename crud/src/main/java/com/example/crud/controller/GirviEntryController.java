package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.crud.entity.Girvi;
import com.example.crud.service.GirviEntryService;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/api/v1/girvi")
public class GirviEntryController {
	
	@Autowired
	private GirviEntryService girviEntryService; 

	@GetMapping("/greet/msg")
	public String greet() {
		return "Hello, Ripu this is Spring boot project with Docker.";
	}
	
	@GetMapping("/get/detail/{id}")
	public ResponseEntity<Girvi> getAllEntries(@PathVariable("id") Integer id) {
		System.out.println(">>>>>>>>>>> from controller "+id);
		Girvi response = girviEntryService.getRecordDetailById(id); 
		return new ResponseEntity<Girvi>(response, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Girvi> createRecord(@RequestBody Girvi girvi){
		System.out.println(">>>>>>>>>>>>>>>>> from controller "+girvi);
		Girvi response = girviEntryService.createGirviRecord(girvi);
		return new ResponseEntity<Girvi>(response, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<List<Girvi>> getAllRecords(){
		List<Girvi> responseList = girviEntryService.getAllGirviRecord();
		return new ResponseEntity<List<Girvi>>(responseList, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/detail/{id}")
	public String deleteRecord(@PathVariable("id") Integer id) {
		String response = girviEntryService.deleteRecordById(id);
		return response;
	}
}
