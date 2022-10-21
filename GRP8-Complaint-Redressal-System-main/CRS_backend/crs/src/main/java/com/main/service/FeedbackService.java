package com.main.service;

import java.util.List;

import com.main.model.Feedbacks;

public interface FeedbackService {
	List<Feedbacks> fetchAllFeedbacks();
	void saveFeedback (Feedbacks feedback);
	

}
