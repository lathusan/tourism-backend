package com.tourism.springboot.dto;

public class HotelDto {

	private Long id;
	private Long hotelName;
	private String hotelImg;
	private String hotelRate;
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
