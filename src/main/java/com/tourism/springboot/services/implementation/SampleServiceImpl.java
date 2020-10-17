package com.tourism.springboot.services.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.springboot.entities.Sample;
import com.tourism.springboot.repositories.SampleRepository;
import com.tourism.springboot.services.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleRepository sampleRepository;

	@Override
	public void addSample(Sample sample) {
		sampleRepository.save(sample);
	}

	@Override
	public void updateSampleById(Sample sample) {
		sampleRepository.save(sample);
	}

	@Override
	public Sample getSample(Long id) {
		return sampleRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		sampleRepository.deleteById(id);
	}

	@Override
	public Optional<Sample> getByIdSample(Long id) {
		return sampleRepository.findById(id);
	}

}
