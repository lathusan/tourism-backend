package com.tourism.springboot.services.implementation;

import java.util.List;

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
	public List<BookingInfo> getBookingInfo() {
		return bookingInfoRepository.findAll();
	}

	@Override
	public List<BookingInfo> getAllBookingInfoByToursId(Long id) { // S=>4
		return bookingInfoRepository.findByToursId(id);
	}

	@Override
	public List<BookingInfo> getAllBookingInfoByPackageId(Long id) {
		return bookingInfoRepository.findByPackagesId(id);
	}

	@Override
	public List<BookingInfo> getAllBookingInfoByHotelId(Long id) {
		return bookingInfoRepository.findByHotelId(id);
	}

}