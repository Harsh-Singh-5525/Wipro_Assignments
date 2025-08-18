package com.practice.classroomservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.classroomservice.model.Attendance;
public interface AttendanceRepository extends JpaRepository<Attendance, Long>{}
