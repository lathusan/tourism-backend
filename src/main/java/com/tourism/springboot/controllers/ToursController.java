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

import com.tourism.springboot.converters.ToursConverter;
import com.tourism.springboot.dto.ToursDto;
import com.tourism.springboot.entities.Tours;
import com.tourism.springboot.services.ToursService;

@RestController
@RequestMapping(value = "api/v1") 
public class ToursController {

	@Autowired
	private ToursService toursService;

	@PostMapping(value = "/tours")
	public ResponseEntity<Object> addTours(@RequestBody ToursDto toursDto) {
		toursService.addTours(ToursConverter.toursDtoToTours(toursDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/tours")
	public List<Tours> getBookingInfo() {
		return toursService.getTours();
	}

	@GetMapping(value = "/tours/{id}")
	public Tours getBookingInfoById(@PathVariable Long id) {
		return toursService.getToursById(id);
	}

	@PutMapping(value = "/tours/{id}")
	public ResponseEntity<Object> updateTours(@RequestBody ToursDto toursDto) {
		toursService.updateTours(ToursConverter.toursDtoToTours(toursDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
	
}
