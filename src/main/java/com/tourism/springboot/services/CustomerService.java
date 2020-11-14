package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer customer);

	public List<Customer> getCustomers();

	public Customer getCustomerById(Long id);
	
	public void updateCustomer (Customer customer);
	
	public List<Customer> getAllCustomerByHotelId(Long id);
	
	public List<Customer> getAllCustomerByPaymentId(Long id);
	
	public List<Customer> getAllCustomerByBookingInfoId(Long id);

}
