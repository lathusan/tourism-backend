package com.tourism.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.springboot.entities.Tours;

@Repository
public interface ToursRepository extends JpaRepository<Tours, Long>{

}
