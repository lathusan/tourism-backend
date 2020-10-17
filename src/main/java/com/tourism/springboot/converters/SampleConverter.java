package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.SampleDto;
import com.tourism.springboot.entities.Sample;

public class SampleConverter {

	// SampleDto to Sample Entity Converter

	public static Sample sampleDtoToSample(SampleDto sampleDto) {
		Sample sample = new Sample();
		if (sampleDto != null) {
			sample.setId(sampleDto.getId());
			sample.setName(sampleDto.getName());
			return sample;
		}
		return null;
	}

	// Sample to SampleDto list converter

	public static List<SampleDto> sampleToSampleDto(List<Sample> sampleList) {
		List<SampleDto> listSampleDto = new ArrayList<>();
		if (sampleList != null) {
			for (Sample sample : sampleList) {
				SampleDto sampleDto = new SampleDto();
				sampleDto.setId(sample.getId());
				sampleDto.setName(sample.getName());
				listSampleDto.add(sampleDto);
			}
			return listSampleDto;
		}
		return null;
	}

}
