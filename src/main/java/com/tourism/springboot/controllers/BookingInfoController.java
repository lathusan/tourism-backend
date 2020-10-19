package com.tourism.springboot.controllers;

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

import com.tourism.springboot.converters.BookingInfoConverter;
import com.tourism.springboot.dto.BookingInfoDto;
import com.tourism.springboot.entities.BookingInfo;
import com.tourism.springboot.services.BookingInfoService;

@RestController
@RequestMapping(value = "api/v1") // Thread path URL
public class BookingInfoController {

	@Autowired
	private BookingInfoService bookingInfoServicce;

	@PostMapping(value = "/bookinginfo") // Last path URL
	public ResponseEntity<Object> addBookingInfo(@RequestBody BookingInfoDto bookingInfoDto) {
		bookingInfoServicce.addBookingInfo(BookingInfoConverter.bookingInfoDtoToBookingInfo(bookingInfoDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/bookinginfo")
	public List<BookingInfo> getBookingInfo(){
		return bookingInfoServicce.getBookingInfo();
	}

	@GetMapping(value = "/bookinginfo/{id}")
	public BookingInfo getBookingInfoById(@PathVariable Long id) {
		return bookingInfoServicce.getBookingInfoById(id);
	}

	@DeleteMapping(value = "/bookinginfo/{id}")
	public void deleteBookingInfo(@PathVariable Long id) {
		bookingInfoServicce.deleteById(id);
	}

}
