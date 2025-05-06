package com.example.hotel.Hotel.Service.UHS.Service;

import java.util.List;

import com.example.hotel.Hotel.Service.UHS.entity.Hotel;

public interface HotelService {

	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel getById(Long hotelId);
	
	String deleteHotel(Long hotelId);
	
	
}
