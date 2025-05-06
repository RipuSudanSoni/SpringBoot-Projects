package com.mongodb.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.project.entity.PaymentInfo;

//public interface PaymentInfoRepo extends MongoRepository<PaymentInfo, Long>{
//
//}

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, Long>{

}