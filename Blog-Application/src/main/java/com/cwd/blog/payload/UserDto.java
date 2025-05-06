package com.cwd.blog.payload;

import lombok.Data;

@Data
public class UserDto {

	private Long userId;
	private String name;
	private String email;
	private String password;
	private String about;
}
