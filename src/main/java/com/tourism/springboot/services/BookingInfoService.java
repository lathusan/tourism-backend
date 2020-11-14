package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.BookingInfo;

public interface BookingInfoService {

	public void addBookingInfo(BookingInfo bookingInfo);

	public List<BookingInfo> getBookingInfo();

	public BookingInfo getBookingInfoById(Long id);

	public void deleteById(Long id);
	
	public List<BookingInfo> getAllBookingInfoByToursId(Long id); // Write the method S=>3
	
	public List<BookingInfo> getAllBookingInfoByPackageId(Long id);
	
	public List<BookingInfo> getAllBookingInfoByHotelId(Long id);

}