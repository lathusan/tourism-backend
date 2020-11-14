package com.tourism.springboot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.springboot.entities.Payment;
import com.tourism.springboot.repositories.PaymentRepository;
import com.tourism.springboot.services.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public void addPayment(Payment payment) {
		paymentRepository.save(payment);

	}

	@Override
	public List<Payment> getPayment() {
		return paymentRepository.findAll();

	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentRepository.findById(id).get();

	}

	@Override
	public void updatePayment(Payment payment) {
		paymentRepository.save(payment);

	}

}
