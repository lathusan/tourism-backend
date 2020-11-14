package com.tourism.springboot.dto;

import java.util.Date;

public class PaymentDto {

	private Long id;
	private String payMethod;
	private String cardName;
	private int cardNum;
	private Date expDate;
	private int cardCVC;
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
