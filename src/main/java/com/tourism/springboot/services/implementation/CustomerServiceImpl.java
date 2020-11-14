package com.tourism.springboot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.springboot.entities.Customer;
import com.tourism.springboot.repositories.CustomerRepository;
import com.tourism.springboot.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomerByHotelId(Long id) {
		return customerRepository.findByHotelId(id);
	}

	@Override
	public List<Customer> getAllCustomerByPaymentId(Long id) {
		return customerRepository.findByPaymentId(id);
	}

	@Override
	public List<Customer> getAllCustomerByBookingInfoId(Long id) {
		return customerRepository.findByPaymentId(id);
	}

}
