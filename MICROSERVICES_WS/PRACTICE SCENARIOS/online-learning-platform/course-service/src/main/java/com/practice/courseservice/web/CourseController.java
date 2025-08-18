package com.practice.courseservice.web;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import com.practice.courseservice.repo.*;
import com.practice.courseservice.model.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepo;
    private final EnrollmentRepository enrollRepo;
    private final RestTemplate rest;

    public CourseController(CourseRepository c, EnrollmentRepository e, RestTemplate r) {
        this.courseRepo = c;
        this.enrollRepo = e;
        this.rest = r;
    }

    @Value("${services.user}")
    private String userService;

    @PostMapping
    public Course create(@RequestBody @Validated Course c) {
        return courseRepo.save(c);
    }

    @GetMapping
    public List<Course> all() {
        return courseRepo.findAll();
    }

    @PostMapping("/{courseId}/enroll/{studentId}")
    public ResponseEntity<?> enroll(@PathVariable Long courseId, @PathVariable Long studentId) {
        if (!courseRepo.existsById(courseId)) {
            return ResponseEntity.badRequest().body("Course not found");
        }

        try {
            ResponseEntity<Map> user =
                    rest.getForEntity(userService + "/users/" + studentId, Map.class);

            if (!user.getStatusCode().is2xxSuccessful() || user.getBody() == null) {
                return ResponseEntity.badRequest().body("Student not found");
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("User validation failed: " + ex.getMessage());
        }

        Enrollment en = new Enrollment();
        en.setCourseId(courseId);
        en.setStudentId(studentId);

        return ResponseEntity.ok(enrollRepo.save(en));
    }

}
