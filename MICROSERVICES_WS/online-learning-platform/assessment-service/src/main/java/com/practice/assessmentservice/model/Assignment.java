package com.practice.assessmentservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.*;
@Entity
public class Assignment {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotNull private Long courseId; @NotBlank private String title; private LocalDate dueDate;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public Long getCourseId(){return courseId;} public void setCourseId(Long courseId){this.courseId=courseId;}
  public String getTitle(){return title;} public void setTitle(String title){this.title=title;}
  public LocalDate getDueDate(){return dueDate;} public void setDueDate(LocalDate d){this.dueDate=d;}
}
