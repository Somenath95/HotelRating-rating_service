package com.project.hotel.user.ratingService.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hotel.user.ratingService.entities.Rating;
import com.project.hotel.user.ratingService.repositories.RatingRepository;
import com.project.hotel.user.ratingService.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {

		Rating ratingObj = ratingRepository.save(rating);
		return ratingObj;
	}

	@Override
	public List<Rating> getAllRatings() {
		List<Rating> ratingList = ratingRepository.findAll();
		return ratingList;
	}

	@Override
	public List<Rating> getAllRatingsByUserId(String userId) {
		List<Rating> ratingList = ratingRepository.findByUserId(userId);
		return ratingList;
	}

	@Override
	public List<Rating> getAllRatingsByHotelId(String hotelId) {
		List<Rating> ratingList = ratingRepository.findByHotelId(hotelId);
		return ratingList;
	}

}
