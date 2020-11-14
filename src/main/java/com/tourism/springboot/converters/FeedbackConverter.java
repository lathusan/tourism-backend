package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.FeedbackDto;
import com.tourism.springboot.entities.Feedback;

public class FeedbackConverter {

	public static Feedback feedbackDtoToFeedback(FeedbackDto feedbackDto) {
		Feedback feedback = new Feedback();
		if (feedbackDto != null) {
			feedback.setId(feedbackDto.getId());
			feedback.setName(feedbackDto.getName());
			feedback.setEmailId(feedbackDto.getEmailId());
			feedback.setMessage(feedbackDto.getMessage());
			feedback.setPhoneNumber(feedbackDto.getPhoneNumber());
			return feedback;
		}
		/*
		 * try { feedbackDto = null; } catch (NullPointerException ne) {
		 * System.out.println(ne); }
		 */
		return null;
	}

	public static List<FeedbackDto> feedbackToFeedbackDto(List<Feedback> feedbacklist) {
		List<FeedbackDto> listFeedbackDto = new ArrayList<>();
		if (feedbacklist != null) {
			for (Feedback feedback : feedbacklist) {
				FeedbackDto feedbackDto = new FeedbackDto();
				feedbackDto.setId(feedback.getId());
				feedbackDto.setName(feedback.getName());
				feedbackDto.setEmailId(feedback.getEmailId());
				feedbackDto.setMessage(feedback.getMessage());
				feedbackDto.setPhoneNumber(feedback.getPhoneNumber());
				
				listFeedbackDto.add(feedbackDto);
			}
			/*
			 * try { feedbacklist = null; } catch (NullPointerException ne) {
			 * System.out.println(ne); }
			 */
			return listFeedbackDto;
		}
		return null;
	}

}
