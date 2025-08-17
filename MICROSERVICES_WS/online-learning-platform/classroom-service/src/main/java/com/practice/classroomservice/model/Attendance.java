package com.practice.classroomservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.*;
@Entity
public class Attendance {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotNull private Long sessionId; @NotNull private Long studentId; private LocalDateTime markedAt=LocalDateTime.now();
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public Long getSessionId(){return sessionId;} public void setSessionId(Long sessionId){this.sessionId=sessionId;}
  public Long getStudentId(){return studentId;} public void setStudentId(Long studentId){this.studentId=studentId;}
  public LocalDateTime getMarkedAt(){return markedAt;} public void setMarkedAt(LocalDateTime t){this.markedAt=t;}
}
