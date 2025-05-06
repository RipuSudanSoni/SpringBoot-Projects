package com.example.quize.quize.service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quize.quize.service.entites.Quize;
import com.example.quize.quize.service.repo.QuizeRepo;

@Service
public class QuizeService {
	
	@Autowired
	private QuizeRepo quizeRepo;
	
	@Autowired
	private QuestionClient questionClient;
	
	
	public Quize saveQuize(Quize quize) {
		return quizeRepo.save(quize);
	}
	
	public Quize getQuize(Long quizeId) {
		Quize quize = quizeRepo.findById(quizeId).orElseThrow(() -> new RuntimeException("No Quize found with this iD :"+quizeId));
		quize.setQuestions(questionClient.getQuestionOfQuize(quize.getQuizeId()));
		return quize;
	}
	
	public List<Quize> getAllQuize() {
		List<Quize> quizes = quizeRepo.findAll();
		quizes.stream().map(quize -> {
			quize.setQuestions(questionClient.getQuestionOfQuize(quize.getQuizeId()));
			return quize;
		}).collect(Collectors.toList());
		return quizes;
	}
	
	public Quize updateQuize(Long quizeId, Quize quize) {
		Quize preQuize = quizeRepo.findById(quizeId).orElseThrow(() -> new RuntimeException("No Quize found with this iD :"+quizeId));
		if(preQuize != null) {
			preQuize.setTitle(quize.getTitle());
		}
		
		return preQuize;
	}
	
	
	public String deleteQuize(Long QuizeId) {
		quizeRepo.deleteById(QuizeId);
		return "Quize Deleted Successfully ...";
	}

}
