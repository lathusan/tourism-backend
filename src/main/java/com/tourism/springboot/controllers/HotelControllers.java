package com.tourism.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourism.springboot.converters.HotelConverters;
import com.tourism.springboot.dto.HotelDto;
import com.tourism.springboot.entities.Hotel;
import com.tourism.springboot.services.HotelService;

@RestController
@RequestMapping(value = "api/v1") 
public class HotelControllers {

	@Autowired
	private HotelService hotelService;

	@PostMapping(value = "/hotel")
	public ResponseEntity<Object> addHotel(@RequestBody HotelDto hotelDto) {
		hotelService.addHotel(HotelConverters.hotelDtoToHotel(hotelDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/hotel")
	public List<Hotel> getBookingInfo() {
		return hotelService.getHotel();
	}

	@GetMapping(value = "/hotel/{id}")
	public Hotel getBookingInfoById(@PathVariable Long id) {
		return hotelService.getHotelById(id);
	}

	@PutMapping(value = "/hotel/{id}")
	public ResponseEntity<Object> updateHotel(@RequestBody HotelDto hotelDto) {
		hotelService.updateHotel(HotelConverters.hotelDtoToHotel(hotelDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
}
