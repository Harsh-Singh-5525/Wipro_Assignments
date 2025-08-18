package com.practice.courseservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.courseservice.model.Course;
public interface CourseRepository extends JpaRepository<Course, Long>{}
