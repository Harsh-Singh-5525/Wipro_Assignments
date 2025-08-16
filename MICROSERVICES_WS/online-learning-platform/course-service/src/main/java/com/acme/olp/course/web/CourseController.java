package com.acme.olp.course.web;

import com.acme.olp.course.model.Course;
import com.acme.olp.course.repo.CourseRepo;
import com.acme.olp.common.events.ClassCreatedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;

@RestController
@RequestMapping("/courses")
public class CourseController {
  private final CourseRepo repo;
  private final KafkaTemplate<String, Object> kafka;

  public CourseController(CourseRepo repo, KafkaTemplate<String, Object> kafka) { this.repo = repo; this.kafka = kafka; }

  @PostMapping
  public Course create(@RequestBody Course c) {
    Course saved = repo.save(c);
    // emit a simple class.created with default start time now+5m
    ClassCreatedEvent evt = new ClassCreatedEvent(saved.getId(), saved.getTeacherId(), Instant.now().plusSeconds(300), "https://meet.local/" + saved.getId());
    kafka.send("class.created", evt);
    return saved;
  }
}
