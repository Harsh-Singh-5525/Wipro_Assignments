package com.acme.olp.assessment.web;

import com.acme.olp.assessment.model.Assessment;
import com.acme.olp.assessment.repo.AssessmentRepo;
import com.acme.olp.common.events.AssignmentCreatedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assessments")
public class AssessmentController {
  private final AssessmentRepo repo;
  private final KafkaTemplate<String, Object> kafka;

  public AssessmentController(AssessmentRepo repo, KafkaTemplate<String, Object> kafka) { this.repo = repo; this.kafka = kafka; }

  @PostMapping
  public Assessment create(@RequestBody Assessment a) {
    Assessment saved = repo.save(a);
    kafka.send("assignment.created", new AssignmentCreatedEvent(saved.getId(), saved.getCourseId(), saved.getDueAt()));
    return saved;
  }
}
