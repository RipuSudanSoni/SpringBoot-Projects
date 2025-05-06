package com.example.hotel.Hotel.Service.UHS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hotel.Hotel.Service.UHS.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Long> {
	

}
