package com.lcwd.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.service.HotelService;

@RestController
@RequestMapping("/rest/api/hotel")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	@PostMapping(value = "/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel createdHotel = hotelService.createHotel(hotel);
		return new ResponseEntity<Hotel>(createdHotel, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("id") Long hotelId) {
		Hotel hotel = hotelService.getHotelById(hotelId);
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/AllHotel")
	public ResponseEntity<List<Hotel>> getHotels() {
		List<Hotel> allHotels = hotelService.getAllHotels();
		return new ResponseEntity<List<Hotel>>(allHotels, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel, @PathVariable("id") Long hotelId) {
		Hotel updatedHotel = hotelService.updateHotel(hotel, hotelId);
		return new ResponseEntity<Hotel>(updatedHotel, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteHotelById(@PathVariable("id") Long hotelId) {
		String msg = hotelService.deleteHotel(hotelId);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
