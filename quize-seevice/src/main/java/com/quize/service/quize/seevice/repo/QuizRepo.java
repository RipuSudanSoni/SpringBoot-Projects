package com.quize.service.quize.seevice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quize.service.quize.seevice.entities.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Long>{

}
