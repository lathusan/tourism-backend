package com.tourism.springboot.services;

import java.util.List;
import java.util.Optional;

import com.tourism.springboot.entities.BookingInfo;

public interface BookingInfoService {

	public void addBookingInfo(BookingInfo bookingInfo);

	public List<BookingInfo> getBookingInfo();

	public BookingInfo getBookingInfoById(Long id);

	public void deleteById(Long id);

	public Optional<BookingInfo> getByIdBookingInfo(Long id);

}
