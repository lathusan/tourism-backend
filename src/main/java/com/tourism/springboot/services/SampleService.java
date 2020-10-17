package com.tourism.springboot.services;

import java.util.Optional;

import com.tourism.springboot.entities.Sample;

public interface SampleService {

	public void addSample(Sample sample);

	public void updateSampleById(Sample sample);

	public Sample getSample(Long id);

	public void deleteById(Long id);

	public Optional<Sample> getByIdSample(Long id);

}
