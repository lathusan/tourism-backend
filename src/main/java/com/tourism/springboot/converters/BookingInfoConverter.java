package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.BookingInfoDto;
import com.tourism.springboot.entities.BookingInfo;

public class BookingInfoConverter {

	// BookingInfoDto to BookingInfo Entity Converter

	public static BookingInfo bookingInfoDtoToBookingInfo(BookingInfoDto bookingInfoDto) {
		BookingInfo bookingInfo = new BookingInfo();

		if (bookingInfoDto != null) {
			bookingInfo.setId(bookingInfoDto.getId());
			bookingInfo.setName(bookingInfoDto.getName());
			bookingInfo.setAddress(bookingInfoDto.getAddress());
			bookingInfo.setCost(bookingInfoDto.getCost());
			bookingInfo.setMobileNo(bookingInfoDto.getMobileNo());
		}

		try {
			bookingInfoDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return bookingInfo;
	}

	// BookingInfo to BookingInfoDto list converter

	public static List<BookingInfoDto> bookingInfoToBookingInfoDto(List<BookingInfo> bookingInfolist) {
		List<BookingInfoDto> listBookingInfoDto = new ArrayList<>();
		
		if (bookingInfolist != null) {
			for (BookingInfo bookingInfo : bookingInfolist) {
				BookingInfoDto bookingInfoDto = new BookingInfoDto();
				bookingInfoDto.setId(bookingInfo.getId());
				bookingInfoDto.setName(bookingInfo.getName());
				bookingInfoDto.setAddress(bookingInfo.getAddress());
				bookingInfoDto.setCost(bookingInfo.getCost());
				bookingInfoDto.setMobileNo(bookingInfo.getMobileNo());
				listBookingInfoDto.add(bookingInfoDto);
			}

			try {
				bookingInfolist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listBookingInfoDto;
	}

}