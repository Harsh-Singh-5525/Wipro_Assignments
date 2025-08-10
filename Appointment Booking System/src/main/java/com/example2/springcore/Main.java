package com.example2.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AppointmentService service = (AppointmentService) context.getBean("appointmentService");

        String result1 = service.book("DOC101", "2025-04-11");
        System.out.println(result1); // Expected: Appointment confirmed

        String result2 = service.book("DOC101", "2025-04-12");
        System.out.println(result2); // Expected: Doctor not available
    }
}
