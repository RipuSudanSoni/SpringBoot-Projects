package com.example.question.question.service.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.question.question.service.entites.Questions;
import com.example.question.question.service.repo.QuestionRepo;


@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;
	
	Logger logger = LoggerFactory.getLogger(QuestionService.class);
	
	public Questions saveQuestion(Questions question) {
		return questionRepo.save(question);
	}
	
	public Questions getQuestion(Long questionId) {
		System.out.println("???????????????????? questionId = "+questionId);
		return questionRepo.findById(questionId).orElseThrow();
		
//		Optional<Questions> que =  questionRepo.findById(questionId);
//		if(que.isPresent()) {
//			return que.get();
//		}
//		return null;
	}
	
	public List<Questions> getAlListQuestionsOfQuize(Long quizeId) {
		System.out.println("???????????????????? "+quizeId);
		logger.info(">>>>>>>>>>>>>>>> quizeId : {}",quizeId);
		return questionRepo.findByQuizeId(quizeId);
	}
	
	public List<Questions> getAllQuestions() {
		return questionRepo.findAll();
	}
	
	public Questions updateQuestions(Long questionId, Questions questions) {
		Questions preQue = questionRepo.findById(questionId).orElseThrow();
		if(preQue != null) {
			preQue.setSub(questions.getSub());
			preQue.setQuestion(questions.getQuestion());
		}
		
		return preQue;
	}
	
	
	public String deleteQuestion(Long QuestionId) {
		questionRepo.deleteById(QuestionId);
		return "Deleted Successfully ...";
	}

}
