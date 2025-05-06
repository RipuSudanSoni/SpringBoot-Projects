package com.rest.project.dto;
import lombok.Data;

@Data
public class UserDto {
	
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;


}


