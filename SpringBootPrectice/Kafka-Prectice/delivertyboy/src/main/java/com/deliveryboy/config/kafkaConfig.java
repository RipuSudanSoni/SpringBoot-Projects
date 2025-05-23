package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Configuration
public class kafkaConfig {

	
	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(AppConstant.LOCATION_TOPIC_NAME)
//				.partitions(0)
//				.replicas(0)
				.build();
	}
}
