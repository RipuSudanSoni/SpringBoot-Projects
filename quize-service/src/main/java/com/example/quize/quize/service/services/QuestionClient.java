package com.example.quize.quize.service.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.quize.quize.service.entites.Question;

@FeignClient(url = "localhost:8081/", value = "question-client")
public interface QuestionClient {
	
	@GetMapping("api/v1/question/get/by/quizeId/{id}")
	public List<Question> getQuestionOfQuize(@PathVariable("id") Long id);

}
