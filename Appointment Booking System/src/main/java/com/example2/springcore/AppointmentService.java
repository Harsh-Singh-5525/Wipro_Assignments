package com.example2.springcore;

import java.time.LocalDate;

public class AppointmentService {
    private DoctorRepository doctorRepository;

    // Setter for Spring injection
    public void setDoctorRepository(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public String book(String doctorId, String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);
        if (doctorRepository.isAvailable(doctorId, date)) {
            // Note: Here you could update the schedule or appointments as needed
            return "Appointment confirmed";
        } else {
            return "Doctor not available";
        }
    }
}
