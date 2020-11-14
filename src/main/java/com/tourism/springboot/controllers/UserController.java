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
import com.tourism.springboot.entities.Customer;
import com.tourism.springboot.services.CustomerService;

@RestController
@RequestMapping(value = "api/v1") 
public class UserController {

	@Autowired
	private CustomerService userService;

	@PostMapping(value = "/user")
	public ResponseEntity<Object> addCustomer(@RequestBody CustomerDto customerDto) {
		userService.addCustomer(CustomerConverter.customerDtoToCustomer(customerDto));
		return new ResponseEntity<Object>("User Info Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/user")
	public List<Customer> getBookingInfo() {
		return userService.getCustomers();
	}

	@GetMapping(value = "/user/{id}")
	public Customer getBookingInfoById(@PathVariable Long id) {
		return userService.getCustomerById(id);
	}

	@PutMapping(value = "/user/{id}")
	public ResponseEntity<Object> updateCustomer(@RequestBody CustomerDto customerDto) {
		userService.updateCustomer(CustomerConverter.customerDtoToCustomer(customerDto));
		return new ResponseEntity<Object>("User Info Updated Successfully", HttpStatus.OK);
	}
	
}
