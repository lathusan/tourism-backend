package com.tourism.springboot.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.springboot.entities.BookingInfo;
import com.tourism.springboot.repositories.BookingInfoRepository;
import com.tourism.springboot.services.BookingInfoService;

@Service
public class BookingInfoServiceImpl implements BookingInfoService {

	@Autowired
	private BookingInfoRepository bookingInfoRepository;

	@Override
	public void addBookingInfo(BookingInfo bookingInfo) {
		bookingInfoRepository.save(bookingInfo);
	}

	@Override
	public BookingInfo getBookingInfoById(Long id) {
		return bookingInfoRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		bookingInfoRepository.deleteById(id);
	}

	@Override
	public Optional<BookingInfo> getByIdBookingInfo(Long id) {
		return bookingInfoRepository.findById(id);
	}

	@Override
	public List<BookingInfo> getBookingInfo() {
		return bookingInfoRepository.findAll();
	}

}
