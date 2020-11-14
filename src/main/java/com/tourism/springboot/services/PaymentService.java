package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.Payment;

public interface PaymentService {

	public void addPayment(Payment payment);

	public List<Payment> getPayment();

	public Payment getPaymentById(Long id);
	
	public void updatePayment(Payment payment);
	
}
