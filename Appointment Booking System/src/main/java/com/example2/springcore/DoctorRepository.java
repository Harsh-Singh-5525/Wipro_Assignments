package com.example2.springcore;

import java.time.LocalDate;

public interface DoctorRepository {
 boolean isAvailable(String doctorId, LocalDate date);
}

