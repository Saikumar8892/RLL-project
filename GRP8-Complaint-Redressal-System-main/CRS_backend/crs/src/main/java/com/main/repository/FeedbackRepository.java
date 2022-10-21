package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Feedbacks;

public interface FeedbackRepository extends JpaRepository<Feedbacks, Integer> {

}
