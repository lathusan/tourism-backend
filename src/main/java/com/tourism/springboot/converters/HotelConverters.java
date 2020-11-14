package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.HotelDto;
import com.tourism.springboot.entities.Hotel;

public class HotelConverters {

	public static Hotel hotelDtoToHotel(HotelDto hotelDto) {
		Hotel hotel = new Hotel();
		if (hotelDto != null) {
			hotel.setId(hotelDto.getId());
			hotel.setHotelName(hotelDto.getHotelName());
			hotel.setHotelImg(hotelDto.getHotelImg());
			hotel.setHotelRate(hotelDto.getHotelRate());
			hotel.setHotelDes(hotelDto.getHotelDes());
			hotel.setHotelCost(hotelDto.getHotelCost());
			hotel.setHotelCountry(hotelDto.getHotelCountry());
			hotel.setHotelTax(hotelDto.getHotelTax());

		}
		try {
			hotelDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return hotel;

	}

	public static List<HotelDto> hotelToHotelDto(List<Hotel> hotellist) {
		List<HotelDto> listHotelDto = new ArrayList<>();
		if (hotellist != null) {
			for (Hotel hotel : hotellist) {
				HotelDto hotelDto = new HotelDto();
				hotelDto.setId(hotel.getId());
				hotelDto.setHotelName(hotel.getHotelName());
				hotelDto.setHotelImg(hotel.getHotelImg());
				hotelDto.setHotelRate(hotel.getHotelRate());
				hotelDto.setHotelDes(hotel.getHotelDes());
				hotelDto.setHotelCost(hotel.getHotelCost());
				hotelDto.setHotelCountry(hotel.getHotelCountry());
				hotelDto.setHotelTax(hotel.getHotelTax());
				listHotelDto.add(hotelDto);
			}
			
			try {
				hotellist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listHotelDto;
	}

}
