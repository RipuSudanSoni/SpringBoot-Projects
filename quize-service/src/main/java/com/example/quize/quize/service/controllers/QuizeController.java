package com.example.quize.quize.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quize.quize.service.entites.Quize;
import com.example.quize.quize.service.services.QuizeService;

@RestController
@RequestMapping("/api/v1/quize")
public class QuizeController {

	
	@Autowired
	private QuizeService quizeService;
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Quize> saveQuize(@RequestBody Quize quize){
	
		Quize savedQuize = quizeService.saveQuize(quize);
		return new ResponseEntity<Quize>(savedQuize, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getQuize(@PathVariable("id") Long id) {
		Quize quize = quizeService.getQuize(id);
//		System.out.println("Response >>>>>>>>>>>>>> = "+question);
		return new ResponseEntity<>(quize, HttpStatus.OK);
	}

	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllQuize() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return new ResponseEntity<>(quizeService.getAllQuize(), HttpStatus.OK);
		
	}
	
	
	@PutMapping("/update/{queId}")
	public ResponseEntity<?> updateQuestion(@PathVariable Long queId, @RequestBody Quize quize) {
		Quize updatedQuize = quizeService.updateQuize(queId, quize);
		return new ResponseEntity<>(updatedQuize, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{quizeId}")
	public ResponseEntity<?> deleteQues(@PathVariable Long quizeId) {
		return new ResponseEntity<>(quizeService.deleteQuize(quizeId), HttpStatus.OK);
	}
}
