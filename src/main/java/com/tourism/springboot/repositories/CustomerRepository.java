package com.tourism.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourism.springboot.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public List<Customer> findByHotelId(Long id);
	
	public List<Customer> findByPaymentId(Long id);
	
	public List<Customer> findByBookingInfoId(Long id);
	
}
