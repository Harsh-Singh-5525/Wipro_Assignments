package com.example.airline;

import java.util.HashMap;
import java.util.Map;

public class FlightService {

    // Stores available seats for each flight
    private Map<String, Integer> flightSeats = new HashMap<>();

    public FlightService() {
        // Preload some flight data
        flightSeats.put("FL123", 2);
        flightSeats.put("FL456", 0);
    }

    public boolean isAvailable(String flightId) {
        Integer seats = flightSeats.get(flightId);
        return seats != null && seats > 0;
    }

    public void reduceSeat(String flightId) {
        flightSeats.put(flightId, flightSeats.get(flightId) - 1);
    }
}