package com.smartcity.userservice.model;
import jakarta.persistence.*;
@Entity public class AppUser { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String email; private String name; public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getEmail(){return email;} public void setEmail(String e){this.email=e;} public String getName(){return name;} public void setName(String n){this.name=n;} }
