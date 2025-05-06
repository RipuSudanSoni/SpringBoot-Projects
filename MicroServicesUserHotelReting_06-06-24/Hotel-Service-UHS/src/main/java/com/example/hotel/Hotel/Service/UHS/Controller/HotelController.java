package com.example.hotel.Hotel.Service.UHS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.Hotel.Service.UHS.Service.HotelService;
import com.example.hotel.Hotel.Service.UHS.entity.Hotel;

@RestController
@RequestMapping("api/v1/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
		Hotel createdHotel = hotelService.create(hotel);
		return new ResponseEntity<Hotel>(createdHotel, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Hotel>> getAll() {
		List<Hotel> hotels = hotelService.getAll();
		return new ResponseEntity<List<Hotel>>(hotels, HttpStatus.OK);
	}
	
	@GetMapping("/getBy/id/{hotel_id}")
	public ResponseEntity<Hotel> getById(@PathVariable("hotel_id") Long hotelId) {
		Hotel hotel = hotelService.getById(hotelId);
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}

	
	
	
}
