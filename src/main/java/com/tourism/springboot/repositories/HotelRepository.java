package com.tourism.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourism.springboot.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
