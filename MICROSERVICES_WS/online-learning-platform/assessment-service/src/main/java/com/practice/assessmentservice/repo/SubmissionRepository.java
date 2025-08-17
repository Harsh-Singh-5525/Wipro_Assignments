package com.practice.assessmentservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.assessmentservice.model.Submission;
public interface SubmissionRepository extends JpaRepository<Submission, Long>{}
