package com.tourism.springboot.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Payment method is mandatory")
	private String payMethod;
	
	@NotBlank(message = "Card Name is mandatory")
	private String cardName;
	
	@NotBlank(message = "Card Number is mandatory")
	@Size(min = 16, max = 30)
	private int cardNum;
	
	@NotBlank(message = "Card Expiry date is mandatory")
	private Date expDate;
	
	@NotBlank(message = "Card CVC Nunmer is mandatory")
	private int cardCVC;
	
	@NotBlank(message = "Amount Number is mandatory")
	private double payAmount;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public int getCardCVC() {
		return cardCVC;
	}

	public void setCardCVC(int cardCVC) {
		this.cardCVC = cardCVC;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}

}
