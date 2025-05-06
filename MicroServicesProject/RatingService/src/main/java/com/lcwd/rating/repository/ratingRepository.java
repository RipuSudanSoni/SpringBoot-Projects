package com.lcwd.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entity.Rating;

public interface ratingRepository extends JpaRepository<Rating, Long>{
	
	//  create custom methods
	List<Rating> findByUserId(Long userId);
	
	List<Rating> findByHotelId(Long hotelId);

}
