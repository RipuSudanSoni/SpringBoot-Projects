package com.example.UserService.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	
	private Long hotelId;
	private String hotelName;
	private String location;
	private String about;
	

}
