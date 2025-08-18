package com.acme.olp.classroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acme.olp.classroom.model.ClassSession;

public interface ClassSessionRepo extends JpaRepository<ClassSession, Long> { }
