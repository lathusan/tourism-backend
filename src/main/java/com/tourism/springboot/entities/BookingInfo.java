package com.tourism.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class BookingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Name is mandatory") // Does not allow a null value, which is what Spring MVC generates if the
												// entry is empty.
	@Size(min = 2, max = 30) // Allows names between 2 and 30 characters long.
	private String name;

	@NotBlank(message = "Cost is mandatory")
	private double cost;

	@NotBlank(message = "MobileNo is mandatory")
	@Size(min = 9, max = 30)
	private int mobileNo;

	@NotBlank(message = "Address is mandatory")
	private String address;

	@ManyToOne // Many to one Relationship S=>1
	@JoinColumn(name = "tours_id", nullable = false) // toursId is column name.
	private Tours tours;

	@ManyToOne
	@JoinColumn(name = "package_id", nullable = false)
	private Packages packages;

	@ManyToOne
	@JoinColumn(name = "hote_id", nullable = false)
	private Hotel hotel;

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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Tours getTours() {
		return tours;
	}

	public void setTours(Tours tours) {
		this.tours = tours;
	}

	public Packages getPackages() {
		return packages;
	}

	public void setPackages(Packages packages) {
		this.packages = packages;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}