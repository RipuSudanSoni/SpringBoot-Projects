package com.example.crud.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Girvi;
import com.example.crud.repository.GirviEntryRepo;

@Service
public class GirviEntryService {
	
	@Autowired
	private GirviEntryRepo girviEntryRepo;
	
//	public String getAllRecords() {
//		return "This is all Records from Service class method...";
//	}
	
	public Girvi getRecordDetailById(Integer id){
		return girviEntryRepo.findById(id).orElse(null);
	}
	
	public Girvi createGirviRecord(Girvi girvi) {
		System.out.println(">>>>>>>>>>>>>>>>> from service "+girvi);
		return girviEntryRepo.save(girvi);
		
	}
	
	public List<Girvi> getAllGirviRecord(){
		return girviEntryRepo.findAll();
	}
	
	public String deleteRecordById(Integer id) {
		girviEntryRepo.deleteById(id);
		return "Record has deleted Succesfully";
	}

}
