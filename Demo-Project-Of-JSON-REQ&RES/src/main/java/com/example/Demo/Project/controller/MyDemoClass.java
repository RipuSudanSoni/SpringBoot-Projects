package com.example.Demo.Project.controller;

import javax.sql.rowset.JoinRowSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Project.entity.MyNum;
import com.example.Demo.Project.poje.MyResponse;

@RestController
@RequestMapping("/api/v1/add")
public class MyDemoClass {
	
	
//	@Autowired
//	private MyResponse myResponse;
//	
	@GetMapping("/num")
	public ResponseEntity<?> AddNum(@RequestBody MyNum num) {
		
		int sum = 0;
		sum = num.getA() + num.getB();
		MyResponse responseEntity = new MyResponse(sum, "Successfully I got Sum.."); 
		return new ResponseEntity<>(responseEntity, HttpStatus.OK);
		
	}

}
