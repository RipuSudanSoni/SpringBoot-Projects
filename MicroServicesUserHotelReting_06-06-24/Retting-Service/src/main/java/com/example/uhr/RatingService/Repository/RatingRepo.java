package com.example.uhr.RatingService.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.uhr.RatingService.entity.Rating;

//public interface RatingRepo extends MongoRepository<Rating, String>{
public interface RatingRepo extends JpaRepository<Rating, Long>{
	
//	@Query("{ 'user_id': ?0 }")
//	public List<Rating> findByUserId(Long user_id);
//	
//	@Query("{ 'hotel_id': ?0 }")
//	public List<Rating> findByHotelId(Long hotel_id);

}
