package com.tourism.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourism.springboot.entities.Packages;

@Repository
public interface PackagesRepository extends JpaRepository<Packages, Long>{

}
