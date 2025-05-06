package com.example.hotel.Hotel.Service.UHS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.Hotel.Service.UHS.Exception.ResorceNotFoundException;
import com.example.hotel.Hotel.Service.UHS.Repo.HotelRepo;
import com.example.hotel.Hotel.Service.UHS.Service.HotelService;
import com.example.hotel.Hotel.Service.UHS.entity.Hotel;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel create(Hotel hotel) {
		Hotel responseHotel = hotelRepo.save(hotel);
		return responseHotel;
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getById(Long hotelId) {
		Hotel hotel = hotelRepo.findById(hotelId).orElseThrow(() -> new ResorceNotFoundException("Hotel Details Not Found with this id :"+hotelId)); 
		return hotel;
	}

	@Override
	public String deleteHotel(Long hotelId) {
		hotelRepo.deleteById(hotelId);
		return "Hotel Deleted Successfully.";
	}


}
