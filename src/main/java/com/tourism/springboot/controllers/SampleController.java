package com.tourism.springboot.controllers;

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

import com.tourism.springboot.converters.SampleConverter;
import com.tourism.springboot.dto.SampleDto;
import com.tourism.springboot.entities.Sample;
import com.tourism.springboot.services.SampleService;

@RestController
@RequestMapping(value = "api/v1") // Thread path URL
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@PostMapping(value = "/sample") // Last path URL
	public ResponseEntity<Object> addSample(@RequestBody SampleDto sampleDto) {
		sampleService.addSample(SampleConverter.sampleDtoToSample(sampleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@PutMapping(value = "/sample/{id}")
	public ResponseEntity<Object> updateSample(@RequestBody SampleDto sampleDto) {
		sampleService.updateSampleById(SampleConverter.sampleDtoToSample(sampleDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}

	@GetMapping(value = "/sample/{id}")
	public Sample getSample(@PathVariable Long id) {
		return sampleService.getSample(id);
	}

	@DeleteMapping(value = "sample/{id}")
	public void deleteSample(@PathVariable Long id) {
		sampleService.deleteById(id);
	}

}
