package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.Hotel;

public interface HotelService {

	public void addHotel(Hotel hotel);

	public List<Hotel> getHotel();

	public Hotel getHotelById(Long id);
	
	public void updateHotel (Hotel hotel);
	
}
