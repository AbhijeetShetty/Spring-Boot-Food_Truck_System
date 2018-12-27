package com.foodtruck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodtruck.model.Feedback;
import com.foodtruck.repository.FeedbackRepository;

@Component
public class FeedbackDAOService {

	
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	public Feedback savefeedback(Feedback feedback ) {
		Feedback savedFeedback = feedbackRepository.save(feedback);
		return savedFeedback;
	}
	
}