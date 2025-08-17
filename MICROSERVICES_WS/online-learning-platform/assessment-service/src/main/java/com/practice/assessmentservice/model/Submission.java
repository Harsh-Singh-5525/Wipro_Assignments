package com.practice.assessmentservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.*;
@Entity
public class Submission {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotNull private Long assignmentId; @NotNull private Long studentId; private String content; private LocalDate submittedOn=LocalDate.now();
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public Long getAssignmentId(){return assignmentId;} public void setAssignmentId(Long assignmentId){this.assignmentId=assignmentId;}
  public Long getStudentId(){return studentId;} public void setStudentId(Long studentId){this.studentId=studentId;}
  public String getContent(){return content;} public void setContent(String content){this.content=content;}
  public LocalDate getSubmittedOn(){return submittedOn;} public void setSubmittedOn(LocalDate d){this.submittedOn=d;}
}
