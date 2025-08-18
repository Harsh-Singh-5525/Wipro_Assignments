package com.practice.assessmentservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.assessmentservice.model.Assignment;
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{}
