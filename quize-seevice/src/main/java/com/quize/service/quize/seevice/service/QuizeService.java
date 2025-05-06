package com.quize.service.quize.seevice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quize.service.quize.seevice.entities.Quiz;
import com.quize.service.quize.seevice.repo.QuizRepo;

@Service
public class QuizeService {

	
	@Autowired
	private QuizRepo quizRepo;
	
	
	public Quiz saveQuiz(Quiz quiz) {
		return quizRepo.save(quiz);
	}
	
	
	public Quiz getQuiz(Long id) {
		Quiz quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found Exception."));
		return quiz;
	}
	
	public List<Quiz> getAllQuiz() {
		return quizRepo.findAll();
	}
}
