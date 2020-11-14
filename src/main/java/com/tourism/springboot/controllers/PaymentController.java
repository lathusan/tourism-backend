package com.tourism.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourism.springboot.converters.PaymentConverter;
import com.tourism.springboot.dto.PaymentDto;
import com.tourism.springboot.entities.Payment;
import com.tourism.springboot.services.PaymentService;

@RestController
@RequestMapping(value = "api/v1") 
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping(value = "/payment")
	public ResponseEntity<Object> addPayment(@RequestBody PaymentDto paymentDto) {
		paymentService.addPayment(PaymentConverter.paymentDtoToPayment(paymentDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/payment")
	public List<Payment> getBookingInfo() {
		return paymentService.getPayment();
	}

	@GetMapping(value = "/payment/{id}")
	public Payment getBookingInfoById(@PathVariable Long id) {
		return paymentService.getPaymentById(id);
	}

	@PutMapping(value = "/payment/{id}")
	public ResponseEntity<Object> updatePayment(@RequestBody PaymentDto paymentDto) {
		paymentService.updatePayment(PaymentConverter.paymentDtoToPayment(paymentDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
}
