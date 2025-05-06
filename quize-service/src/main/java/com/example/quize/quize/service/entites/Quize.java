package com.example.quize.quize.service.entites;

import java.util.List;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.Data;

@Entity
//@Data
public class Quize {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quizeId;
	
	private String title;
	
//	@Transient
	 transient List<Question> questions;

	
	
	
	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
	public Long getQuizeId() {
		return quizeId;
	}

	public void setQuizeId(Long quizeId) {
		this.quizeId = quizeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
