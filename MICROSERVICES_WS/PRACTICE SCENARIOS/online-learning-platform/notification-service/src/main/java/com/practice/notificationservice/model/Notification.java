package com.practice.notificationservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity
public class Notification {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotBlank private String type; private Long refId; @NotBlank private String message; private java.time.LocalDate sendOn=java.time.LocalDate.now(); private boolean sent=false;
  public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getType(){return type;} public void setType(String type){this.type=type;}
  public Long getRefId(){return refId;} public void setRefId(Long refId){this.refId=refId;} public String getMessage(){return message;} public void setMessage(String message){this.message=message;}
  public java.time.LocalDate getSendOn(){return sendOn;} public void setSendOn(java.time.LocalDate d){this.sendOn=d;} public boolean isSent(){return sent;} public void setSent(boolean s){this.sent=s;}
}
