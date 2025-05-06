package com.example.postgresql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		
		entityManagerFactoryRef = "",
		basePackages = {"com.example.postgresql.repo"},
		transactionManagerRef = " "
		
		
		)

public class PostgreSqlConfig {
	
	
	@Autowired
	private Environment environment;
	
	// datasource
	
	
	
	
	// entity managerFactory
	
	
	
	//platforTransectionManger

}
