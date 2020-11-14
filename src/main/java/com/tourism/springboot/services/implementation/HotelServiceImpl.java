package com.tourism.springboot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.springboot.entities.Hotel;
import com.tourism.springboot.repositories.HotelRepository;
import com.tourism.springboot.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public List<Hotel> getHotel() {
		return hotelRepository.findAll();

	}

	@Override
	public Hotel getHotelById(Long id) {
		return hotelRepository.findById(id).get();

	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

}
