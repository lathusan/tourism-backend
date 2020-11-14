package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.CustomerDto;
import com.tourism.springboot.entities.Customer;

public class CustomerConverter {

	public static Customer customerDtoToCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		if (customerDto != null) {
			customer.setId(customerDto.getId());
			customer.setName(customerDto.getName());
		
		}
		try {
			customerDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return customer;
	}

	public static List<CustomerDto> bookingInfoToBookingInfoDto(List<Customer> customerlist) {
		List<CustomerDto> listCustomerDto = new ArrayList<>();
		if (customerlist != null) {
			for (Customer customer : customerlist) {
				CustomerDto customerDto = new CustomerDto();
				customerDto.setId(customer.getId());
				customerDto.setName(customer.getName());
				listCustomerDto.add(customerDto);
			}
			
			try {
				customerlist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listCustomerDto;
	}

}
