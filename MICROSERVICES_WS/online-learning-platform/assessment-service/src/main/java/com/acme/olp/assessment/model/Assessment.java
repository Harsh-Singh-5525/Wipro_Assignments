package com.acme.olp.assessment.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class Assessment {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long courseId;
  private String type;
  private Instant dueAt;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Long getCourseId() { return courseId; }
  public void setCourseId(Long courseId) { this.courseId = courseId; }
  public String getType() { return type; }
  public void setType(String type) { this.type = type; }
  public Instant getDueAt() { return dueAt; }
  public void setDueAt(Instant dueAt) { this.dueAt = dueAt; }
}
