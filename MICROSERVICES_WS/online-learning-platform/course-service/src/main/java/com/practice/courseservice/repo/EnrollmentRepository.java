package com.practice.courseservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.courseservice.model.Enrollment;
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{}
