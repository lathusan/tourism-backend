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

import com.tourism.springboot.converters.PackagesConverter;
import com.tourism.springboot.dto.PackagesDto;
import com.tourism.springboot.entities.Packages;
import com.tourism.springboot.services.PackagesService;

@RestController
@RequestMapping(value = "api/v1") 
public class PackagesController {

	@Autowired
	private PackagesService packagesService;

	@PostMapping(value = "/packages")
	public ResponseEntity<Object> addPackages(@RequestBody PackagesDto packagesDto) {
		packagesService.addPackages(PackagesConverter.packagesDtoToPackages(packagesDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/packages")
	public List<Packages> getBookingInfo() {
		return packagesService.getPackages();
	}

	@GetMapping(value = "/packages/{id}")
	public Packages getBookingInfoById(@PathVariable Long id) {
		return packagesService.getPackagesById(id);
	}

	@PutMapping(value = "/packages/{id}")
	public ResponseEntity<Object> updatePackages(@RequestBody PackagesDto packagesDto) {
		packagesService.updatePackages(PackagesConverter.packagesDtoToPackages(packagesDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
}
