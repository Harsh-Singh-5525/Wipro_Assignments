package com.practice.courseservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.*;
@Entity
public class Enrollment {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotNull private Long courseId; @NotNull private Long studentId; private LocalDate enrolledOn=LocalDate.now();
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public Long getCourseId(){return courseId;} public void setCourseId(Long courseId){this.courseId=courseId;}
  public Long getStudentId(){return studentId;} public void setStudentId(Long studentId){this.studentId=studentId;}
  public LocalDate getEnrolledOn(){return enrolledOn;} public void setEnrolledOn(LocalDate d){this.enrolledOn=d;}
}
