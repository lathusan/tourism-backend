package com.tourism.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.springboot.entities.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	
}
