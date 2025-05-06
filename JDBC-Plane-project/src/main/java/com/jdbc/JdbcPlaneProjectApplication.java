package com.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;

@SpringBootApplication
public class JdbcPlaneProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcPlaneProjectApplication.class, args);

	
		        String url = "jdbc:mysql://localhost:3306/demo";
		        String username = "root";
		        String password = "root";

		   
		        String query = "SELECT * FROM cource";

		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            Connection connection = DriverManager.getConnection(url, username, password);

		            Statement statement = connection.createStatement();

		            ResultSet resultSet = statement.executeQuery(query);

		            while (resultSet.next()) {
		                int id = resultSet.getInt("id");
		                String code = resultSet.getString("code");
		                String description = resultSet.getString("description");
		                String subject = resultSet.getString("subject");

		                System.out.println("ID: " + id +", Code: " + code + ", Description: " + description + ", Subject: " + subject);
		            }

		            resultSet.close();
		            statement.close();
		            connection.close();

		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
		        }

	}

}
