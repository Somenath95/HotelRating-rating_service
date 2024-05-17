package com.project.hotel.user.ratingService.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.hotel.user.ratingService.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	
	//Custom DB Methods
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
}
