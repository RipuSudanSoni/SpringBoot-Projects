package com.mongodb.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.project.entity.PassengerInfo;

//public interface PassengerInfoRepo extends MongoRepository<PassengerInfo, Long>{
//
//}

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long>{

}
