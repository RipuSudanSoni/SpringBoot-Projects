package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.dao.UserDao;

@SpringBootApplication
public class JdbcBootExampleApplication implements CommandLineRunner{
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcBootExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		int response = userDao.createTable();	
		System.out.println(response);
	}

}
