package com.example.scheduling.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scheduling.entity.Logs;

@Repository
public interface LogsRepo extends JpaRepository<Logs, Long>{

	
}
