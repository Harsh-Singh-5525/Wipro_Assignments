package com.practice.classroomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClassroomServiceApplication {
  public static void main(String[] args) { SpringApplication.run(ClassroomServiceApplication.class, args); }
  @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
}
