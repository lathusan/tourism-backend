package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.Feedback;

public interface FeedbackService {

	public void addFeedback(Feedback feedback);

	public List<Feedback> getFeedback();

	public Feedback getFeedbackById(Long id);
	
	public void updateFeedback (Feedback feedback);
	
	
}
