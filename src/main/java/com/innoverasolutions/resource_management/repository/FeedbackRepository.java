package com.innoverasolutions.resource_management.repository;

import com.innoverasolutions.resource_management.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}