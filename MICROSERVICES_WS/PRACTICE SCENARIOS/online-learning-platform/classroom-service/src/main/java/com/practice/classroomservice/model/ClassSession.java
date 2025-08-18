package com.practice.classroomservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.*;
@Entity
public class ClassSession {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotNull private Long courseId; @NotNull private LocalDateTime startTime; private String meetingUrl;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public Long getCourseId(){return courseId;} public void setCourseId(Long courseId){this.courseId=courseId;}
  public LocalDateTime getStartTime(){return startTime;} public void setStartTime(LocalDateTime t){this.startTime=t;}
  public String getMeetingUrl(){return meetingUrl;} public void setMeetingUrl(String m){this.meetingUrl=m;}
}
