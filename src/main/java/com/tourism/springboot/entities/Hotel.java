package com.tourism.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Name is mandatory")
	@Size(min = 2, max = 30)
	private Long hotelName;
	private String hotelImg;	/*================== Img add type ====================*/
	private String hotelRate;
	
	@NotBlank(message = "Descreption is mandatory")
	//@Size(min = 2, max = 1000)
	private String hotelDes;
	
	private double hotelCost;
	private String hotelCountry;
	private double hotelTax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHotelName() {
		return hotelName;
	}

	public void setHotelName(Long hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelImg() {
		return hotelImg;
	}

	public void setHotelImg(String hotelImg) {
		this.hotelImg = hotelImg;
	}

	public String getHotelRate() {
		return hotelRate;
	}

	public void setHotelRate(String hotelRate) {
		this.hotelRate = hotelRate;
	}

	public String getHotelDes() {
		return hotelDes;
	}

	public void setHotelDes(String hotelDes) {
		this.hotelDes = hotelDes;
	}

	public double getHotelCost() {
		return hotelCost;
	}

	public void setHotelCost(double hotelCost) {
		this.hotelCost = hotelCost;
	}

	public String getHotelCountry() {
		return hotelCountry;
	}

	public void setHotelCountry(String hotelCountry) {
		this.hotelCountry = hotelCountry;
	}

	public double getHotelTax() {
		return hotelTax;
	}

	public void setHotelTax(double hotelTax) {
		this.hotelTax = hotelTax;
	}

}
