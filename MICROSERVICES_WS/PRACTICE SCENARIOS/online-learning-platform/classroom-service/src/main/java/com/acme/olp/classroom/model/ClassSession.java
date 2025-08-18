package com.acme.olp.classroom.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class ClassSession {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long courseId;
  private Instant startTime;
  private String meetingUrl;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Long getCourseId() { return courseId; }
  public void setCourseId(Long courseId) { this.courseId = courseId; }
  public Instant getStartTime() { return startTime; }
  public void setStartTime(Instant startTime) { this.startTime = startTime; }
  public String getMeetingUrl() { return meetingUrl; }
  public void setMeetingUrl(String meetingUrl) { this.meetingUrl = meetingUrl; }
}
