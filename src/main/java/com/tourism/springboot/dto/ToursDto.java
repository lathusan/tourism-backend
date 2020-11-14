package com.tourism.springboot.dto;

public class ToursDto {

	private Long id;
	private String tCountry;
	private String tArea;
	private double tCost;
	private double tTax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gettCountry() {
		return tCountry;
	}

	public void settCountry(String tCountry) {
		this.tCountry = tCountry;
	}

	public String gettArea() {
		return tArea;
	}

	public void settArea(String tArea) {
		this.tArea = tArea;
	}

	public double gettCost() {
		return tCost;
	}

	public void settCost(double tCost) {
		this.tCost = tCost;
	}

	public double gettTax() {
		return tTax;
	}

	public void settTax(double tTax) {
		this.tTax = tTax;
	}

}
