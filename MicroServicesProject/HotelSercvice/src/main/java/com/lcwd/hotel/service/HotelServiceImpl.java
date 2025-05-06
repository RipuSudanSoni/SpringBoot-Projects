package com.lcwd.hotel.service;

import java.util.List;

import org.hibernate.ObjectDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepo;

	@Override
	public Hotel createHotel(Hotel hotel) {
		return hotelRepo.save(hotel);
	}

	@Override
	public Hotel getHotelById(Long hotelId) {
		Hotel hotel = hotelRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel Not found with id : "+hotelId));
		return hotel;
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel updateHotel(Hotel hotel, Long hotelId) {
		Hotel preHotel = hotelRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel Not found with id : "+hotelId));
		preHotel.setHotelId(hotel.getHotelId());
		preHotel.setName(hotel.getName());
		preHotel.setLocation(hotel.getLocation());
		preHotel.setAbout(hotel.getAbout());
		return hotelRepo.save(preHotel);
	}

	@Override
	public String deleteHotel(Long hotelId) {
		hotelRepo.deleteById(hotelId);
		return "Hotel deleted successfully"; 
	}

}
