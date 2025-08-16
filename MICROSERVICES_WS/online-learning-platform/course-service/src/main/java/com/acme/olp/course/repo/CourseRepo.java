package com.acme.olp.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acme.olp.course.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> { }
