package com.enduser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConfig {

	
	private Logger logger = LoggerFactory.getLogger(kafkaConfig.class);
	
	@KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
	public void updateLocation(String value) {

		System.out.println(">>>>>>>>>>>>>>>>>>");
		logger.info("Value of Updeated Location"+value);
	}
}
