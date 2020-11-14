package com.tourism.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourism.springboot.entities.BookingInfo;

@Repository
public interface BookingInfoRepository extends JpaRepository<BookingInfo, Long> {
	
	public List<BookingInfo> findByToursId(Long id); // "findBy" is must S=>2

	public List<BookingInfo> findByPackagesId(Long id);
	
	public List<BookingInfo> findByHotelId(Long id);
	
}