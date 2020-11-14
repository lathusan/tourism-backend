package com.tourism.springboot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.springboot.entities.Feedback;
import com.tourism.springboot.repositories.FeedbackRepository;
import com.tourism.springboot.services.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public void addFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);

	}

	@Override
	public List<Feedback> getFeedback() {
		return feedbackRepository.findAll();
	}

	@Override
	public Feedback getFeedbackById(Long id) {
		return feedbackRepository.findById(id).get();

	}

	@Override
	public void updateFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);

	}

}
