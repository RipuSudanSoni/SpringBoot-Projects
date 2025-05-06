package com.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstant;

@Service
public class kafkaService {
	
	private Logger logger = LoggerFactory.getLogger(kafkaService.class);

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME, location);
		logger.info("Location Message Produced >>>>>>>>>>>>>");
		return true;
		
	}
}
