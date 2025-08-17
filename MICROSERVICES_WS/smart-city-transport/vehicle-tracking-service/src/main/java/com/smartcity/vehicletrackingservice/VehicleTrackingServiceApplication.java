package com.smartcity.vehicletrackingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class VehicleTrackingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(VehicleTrackingServiceApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate() { return new RestTemplate(); }
}
