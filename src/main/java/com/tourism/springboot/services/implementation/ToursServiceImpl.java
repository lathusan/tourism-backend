package com.tourism.springboot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.springboot.entities.Tours;
import com.tourism.springboot.repositories.ToursRepository;
import com.tourism.springboot.services.ToursService;

@Service
public class ToursServiceImpl implements ToursService {

	@Autowired
	private ToursRepository toursRepository;

	@Override
	public void addTours(Tours tours) {
		toursRepository.save(tours);

	}

	@Override
	public List<Tours> getTours() {
		return toursRepository.findAll();

	}

	@Override
	public Tours getToursById(Long id) {
		return toursRepository.findById(id).get();

	}

	@Override
	public void updateTours(Tours tours) {
		toursRepository.save(tours);

	}

}
