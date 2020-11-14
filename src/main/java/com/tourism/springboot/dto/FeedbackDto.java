package com.tourism.springboot.dto;

public class FeedbackDto {

	private Long id;
	private String name;
	private String emailId;
	private String message;
	private int phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*
	 * public Long getCustId() { return CustId; } public void setCustId(Long custId)
	 * { CustId = custId; }
	 */

}
