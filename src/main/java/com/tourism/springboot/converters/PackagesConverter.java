package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.PackagesDto;
import com.tourism.springboot.entities.Packages;

public class PackagesConverter {

	public static Packages packagesDtoToPackages(PackagesDto packagesDto) {
		Packages packages = new Packages();
		if (packagesDto != null) {
			packages.setId(packagesDto.getId());
			packages.setPackName(packagesDto.getPackName());
			packages.setPackDes(packagesDto.getPackDes());
			packages.setPackCost(packagesDto.getPackCost());
			packages.setPackPlan(packagesDto.getPackPlan());

		}
		try {
			packagesDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return packages;

	}

	public static List<PackagesDto> packagesToPackagesDto(List<Packages> packageslist) {
		List<PackagesDto> listPackagesDto = new ArrayList<>();
		if (packageslist != null) {
			for (Packages packages : packageslist) {
				PackagesDto packagesDto = new PackagesDto();
				packagesDto.setId(packages.getId());
				packagesDto.setPackName(packages.getPackName());
				packagesDto.setPackDes(packages.getPackDes());
				packagesDto.setPackCost(packages.getPackCost());
				packagesDto.setPackPlan(packages.getPackPlan());
				listPackagesDto.add(packagesDto);
			}
			
			try {
				packageslist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listPackagesDto;
	}

}
