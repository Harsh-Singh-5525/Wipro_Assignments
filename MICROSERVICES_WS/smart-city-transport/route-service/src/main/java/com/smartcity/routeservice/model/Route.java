package com.smartcity.routeservice.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity
public class Route {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotBlank private String name;
  @NotBlank private String mode;
  private boolean active = true;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getName(){return name;} public void setName(String name){this.name=name;}
  public String getMode(){return mode;} public void setMode(String mode){this.mode=mode;}
  public boolean isActive(){return active;} public void setActive(boolean a){this.active=a;}
}
