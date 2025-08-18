package com.smartcity.vehicletrackingservice.model;
import jakarta.persistence.*;
@Entity public class Vehicle { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String fleetCode; private Long routeId; public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getFleetCode(){return fleetCode;} public void setFleetCode(String f){this.fleetCode=f;} public Long getRouteId(){return routeId;} public void setRouteId(Long r){this.routeId=r;} }
