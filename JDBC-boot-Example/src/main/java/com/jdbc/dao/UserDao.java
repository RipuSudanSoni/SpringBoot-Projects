package com.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserDao() {
		
	}
	
	
	// create table
	public int createTable() {
		String query = "CREATE TABLE IF NOT EXISTS User(id int primary key, name varchar(200), age int, city varchar(100))";
		int created = jdbcTemplate.update(query);
		return created;
	}
}
