package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.ToursDto;
import com.tourism.springboot.entities.Tours;

public class ToursConverter {

	public static Tours toursDtoToTours(ToursDto toursDto) {
		Tours tours = new Tours();
		if (toursDto != null) {
			tours.setId(toursDto.getId());
			tours.settCountry(toursDto.gettCountry());
			tours.settArea(toursDto.gettArea());
			tours.settCost(toursDto.gettCost());
			tours.settTax(toursDto.gettTax());

		}
		try {
			toursDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return tours;

	}

	public static List<ToursDto> toursToToursDto(List<Tours> tourslist) {
		List<ToursDto> listToursDto = new ArrayList<>();
		if (tourslist != null) {
			for (Tours tours : tourslist) {
				ToursDto toursDto = new ToursDto();
				toursDto.setId(tours.getId());
				toursDto.settCountry(tours.gettCountry());
				toursDto.settArea(tours.gettArea());
				toursDto.settCost(tours.gettCost());
				toursDto.settTax(tours.gettTax());
				listToursDto.add(toursDto);
			}
			try {
				tourslist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listToursDto;
	}

}
