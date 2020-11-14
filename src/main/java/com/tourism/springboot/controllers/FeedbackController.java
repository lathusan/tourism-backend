package com.tourism.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourism.springboot.converters.FeedbackConverter;
import com.tourism.springboot.dto.FeedbackDto;
import com.tourism.springboot.entities.Feedback;
import com.tourism.springboot.services.FeedbackService;

@CrossOrigin(origins = "http://localhost:3000/feedback")
@RestController
@RequestMapping(value = "api/v1") 
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@PostMapping(value = "/feedback")
	public ResponseEntity<Object> addFeedback(@RequestBody FeedbackDto feedbackDto) {
		feedbackService.addFeedback(FeedbackConverter.feedbackDtoToFeedback(feedbackDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/feedback")
	public List<Feedback> getBookingInfo() {
		return feedbackService.getFeedback();
	}

	@GetMapping(value = "/feedback/{id}")
	public Feedback getBookingInfoById(@PathVariable Long id) {
		return feedbackService.getFeedbackById(id);
	}

	@PutMapping(value = "/feedback/{id}")
	public ResponseEntity<Object> updateFeedback(@RequestBody FeedbackDto feedbackDto) {
		feedbackService.updateFeedback(FeedbackConverter.feedbackDtoToFeedback(feedbackDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
}
