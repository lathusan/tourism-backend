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

import com.tourism.springboot.converters.CustomerConverter;
import com.tourism.springboot.dto.CustomerDto;
import com.tourism.springboot.entities.BookingInfo;
import com.tourism.springboot.entities.Customer;
import com.tourism.springboot.services.CustomerService;

@RestController
@RequestMapping(value = "api/v1")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "/customer")
	public ResponseEntity<Object> addCustomer(@RequestBody CustomerDto customerDto) {
		customerService.addCustomer(CustomerConverter.customerDtoToCustomer(customerDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/customer")
	public List<Customer> getBookingInfo() {
		return customerService.getCustomers();
	}

	@GetMapping(value = "/customer/{id}")
	public Customer getBookingInfoById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	@PutMapping(value = "/customer/{id}")
	public ResponseEntity<Object> updateCustomer(@RequestBody CustomerDto customerDto) {
		customerService.updateCustomer(CustomerConverter.customerDtoToCustomer(customerDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
	@GetMapping(value = "/customer/hotel-id/{id}") // S=>5
	public List<Customer> getAllCustomerByHotelId(@PathVariable Long id) {
		return customerService.getAllCustomerByHotelId(id);
	}
	
	@GetMapping(value = "/customer/payment-id/{id}") // S=>5
	public List<Customer> getAllCustomerByPaymentId(@PathVariable Long id) {
		return customerService.getAllCustomerByPaymentId(id);
	}
	
	@GetMapping(value = "/customer/bookinginfo-id/{id}") // S=>5
	public List<Customer> getAllCustomerByBookingInfoId(@PathVariable Long id) {
		return customerService.getAllCustomerByBookingInfoId(id);
	}

}
