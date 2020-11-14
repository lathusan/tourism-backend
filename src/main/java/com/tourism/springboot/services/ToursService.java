package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.Tours;

public interface ToursService {

	public void addTours(Tours tours);

	public List<Tours> getTours();

	public Tours getToursById(Long id);
	
	public void updateTours (Tours tours);
	
}
