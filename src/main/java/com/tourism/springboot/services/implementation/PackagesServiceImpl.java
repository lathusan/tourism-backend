package com.tourism.springboot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.springboot.entities.Packages;
import com.tourism.springboot.repositories.PackagesRepository;
import com.tourism.springboot.services.PackagesService;

@Service
public class PackagesServiceImpl implements PackagesService {

	@Autowired
	private PackagesRepository packagesRepository;

	@Override
	public void addPackages(Packages packages) {
		packagesRepository.save(packages);

	}

	@Override
	public List<Packages> getPackages() {
		return packagesRepository.findAll();

	}

	@Override
	public Packages getPackagesById(Long id) {
		return packagesRepository.findById(id).get();

	}

	@Override
	public void updatePackages(Packages packages) {
		packagesRepository.save(packages);

	}

}
