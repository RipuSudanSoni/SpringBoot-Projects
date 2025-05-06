package com.example.question.question.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.question.question.service.entites.Questions;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Long>{

	
	List<Questions> findByQuizeId(Long quizeId);
}
