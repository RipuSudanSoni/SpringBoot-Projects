package com.lcwd.hotel.service;

import java.util.List;

import com.lcwd.hotel.entity.Hotel;

public interface HotelService {

	public Hotel createHotel(Hotel hotel);
	
	public Hotel getHotelById(Long hotelId);
	
	public List<Hotel> getAllHotels();
	
	public Hotel updateHotel(Hotel hotel, Long hotelId);
	
	public String deleteHotel(Long hotelId);
}
