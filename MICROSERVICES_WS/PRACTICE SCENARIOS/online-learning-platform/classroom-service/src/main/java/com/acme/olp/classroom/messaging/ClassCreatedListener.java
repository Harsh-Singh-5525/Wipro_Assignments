package com.acme.olp.classroom.messaging;

import com.acme.olp.classroom.model.ClassSession;
import com.acme.olp.classroom.repo.ClassSessionRepo;
import com.acme.olp.common.events.ClassCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ClassCreatedListener {
  private final ClassSessionRepo repo;
  public ClassCreatedListener(ClassSessionRepo repo) { this.repo = repo; }

  @KafkaListener(topics = "class.created", groupId = "classroom")
  public void onClassCreated(ClassCreatedEvent evt) {
    ClassSession s = new ClassSession();
    s.setCourseId(evt.courseId());
    s.setStartTime(evt.startAt());
    s.setMeetingUrl(evt.meetingUrl());
    repo.save(s);
  }
}
