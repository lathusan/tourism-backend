package com.tourism.springboot.dto;

public class SampleDto {

	private Long SampleDtoId;
	private Long id;
	private String name;

	public Long getSampleDtoId() {
		return SampleDtoId;
	}

	public void setSampleDtoId(Long sampleDtoId) {
		SampleDtoId = sampleDtoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
