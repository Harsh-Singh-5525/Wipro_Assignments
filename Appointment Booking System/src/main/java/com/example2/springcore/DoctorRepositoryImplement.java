package com.example2.springcore;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class DoctorRepositoryImplement implements DoctorRepository {

    // Changed to List<String> to avoid conversion issues in XML
    private Map<String, List<String>> doctorSchedule;

    public void setDoctorSchedule(Map<String, List<String>> doctorSchedule) {
        this.doctorSchedule = doctorSchedule;
    }

    @Override
    public boolean isAvailable(String doctorId, LocalDate date) {
        List<String> availableDates = doctorSchedule.get(doctorId);
        if (availableDates == null) {
            return false;
        }
        // Compare string representations to avoid conversion issues
        String dateStr = date.toString();
        return availableDates.contains(dateStr);
    }
}
