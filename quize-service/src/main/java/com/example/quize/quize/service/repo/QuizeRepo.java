package com.example.quize.quize.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quize.quize.service.entites.Quize;

@Repository
public interface QuizeRepo extends JpaRepository<Quize, Long>{

}
