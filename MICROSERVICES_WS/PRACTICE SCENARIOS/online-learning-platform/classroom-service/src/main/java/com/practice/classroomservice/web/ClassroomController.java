package com.practice.classroomservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import org.springframework.validation.annotation.Validated; import java.util.*;
import com.practice.classroomservice.repo.*; import com.practice.classroomservice.model.*;
@RestController @RequestMapping("/classroom")
public class ClassroomController {
  private final ClassSessionRepository sessionRepo; private final AttendanceRepository attendanceRepo;
  public ClassroomController(ClassSessionRepository s, AttendanceRepository a){this.sessionRepo=s; this.attendanceRepo=a;}
  @PostMapping("/sessions") public ClassSession createSession(@RequestBody @Validated ClassSession s){return sessionRepo.save(s);}
  @GetMapping("/sessions") public List<ClassSession> sessions(){return sessionRepo.findAll();}
  @PostMapping("/sessions/{sessionId}/attendance/{studentId}")
  public ResponseEntity<?> markAttendance(@PathVariable Long sessionId, @PathVariable Long studentId){
    if(!sessionRepo.existsById(sessionId)) return ResponseEntity.badRequest().body("Session not found");
    Attendance at=new Attendance(); at.setSessionId(sessionId); at.setStudentId(studentId);
    return ResponseEntity.ok(attendanceRepo.save(at));
  }
}
