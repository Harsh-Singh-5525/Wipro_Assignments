package com.acme.olp.assessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acme.olp.assessment.model.Assessment;

public interface AssessmentRepo extends JpaRepository<Assessment, Long> { }
