package com.practice.classroomservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.classroomservice.model.ClassSession;
public interface ClassSessionRepository extends JpaRepository<ClassSession, Long>{}
