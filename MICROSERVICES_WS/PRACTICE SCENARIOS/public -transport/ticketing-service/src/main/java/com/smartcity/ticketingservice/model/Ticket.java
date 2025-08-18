package com.smartcity.ticketingservice.model;
import jakarta.persistence.*; import java.time.*;
@Entity public class Ticket { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private Long userId; private Long routeId; private Double fare; private String currency; private String status="purchased"; public Long getId(){return id;} public void setId(Long id){this.id=id;} public Long getUserId(){return userId;} public void setUserId(Long u){this.userId=u;} }
