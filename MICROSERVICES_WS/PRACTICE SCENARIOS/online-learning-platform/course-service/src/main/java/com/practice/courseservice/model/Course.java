package com.practice.courseservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity
public class Course {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotBlank private String title; private String syllabus; @NotNull private Long teacherId;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getTitle(){return title;} public void setTitle(String title){this.title=title;}
  public String getSyllabus(){return syllabus;} public void setSyllabus(String syllabus){this.syllabus=syllabus;}
  public Long getTeacherId(){return teacherId;} public void setTeacherId(Long teacherId){this.teacherId=teacherId;}
}
