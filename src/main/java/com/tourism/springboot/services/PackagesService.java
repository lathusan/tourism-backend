package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.Packages;

public interface PackagesService {

	public void addPackages(Packages packages);

	public List<Packages> getPackages();

	public Packages getPackagesById(Long id);
	
	public void updatePackages (Packages packages);
	
}
