package com.tourism.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Packages {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String packName;
	private String packDes;
	private double packCost;
	private String packPlan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getPackDes() {
		return packDes;
	}

	public void setPackDes(String packDes) {
		this.packDes = packDes;
	}

	public double getPackCost() {
		return packCost;
	}

	public void setPackCost(double packCost) {
		this.packCost = packCost;
	}

	public String getPackPlan() {
		return packPlan;
	}

	public void setPackPlan(String packPlan) {
		this.packPlan = packPlan;
	}

}
