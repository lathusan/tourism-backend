package com.tourism.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Tours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Country is mandatory")
	private String tCountry;
	
	@NotBlank(message = "Area is mandatory")
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
