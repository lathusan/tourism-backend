package com.tourism.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourism.springboot.entities.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {

}
