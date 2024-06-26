package com.project.hotel.user.ratingService.controllers;

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

import com.project.hotel.user.ratingService.entities.Rating;
import com.project.hotel.user.ratingService.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}

	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings() {
		return ResponseEntity.ok(ratingService.getAllRatings());
	}

	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.ok(ratingService.getAllRatingsByHotelId(hotelId));
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable String userId) {
		return ResponseEntity.ok(ratingService.getAllRatingsByHotelId(userId));
	}
}
