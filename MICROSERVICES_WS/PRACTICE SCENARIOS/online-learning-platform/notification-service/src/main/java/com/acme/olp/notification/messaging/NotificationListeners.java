package com.acme.olp.notification.messaging;

import com.acme.olp.common.events.AssignmentCreatedEvent;
import com.acme.olp.common.events.ClassCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListeners {

  @KafkaListener(topics = "class.created", groupId = "notification")
  public void onClassCreated(ClassCreatedEvent evt) {
    System.out.println("[notification] Reminder scheduled for class: " + evt.courseId() + " at " + evt.startAt());
  }

  @KafkaListener(topics = "assignment.created", groupId = "notification")
  public void onAssignmentCreated(AssignmentCreatedEvent evt) {
    System.out.println("[notification] Reminder scheduled for assignment: " + evt.assessmentId() + " due at " + evt.dueAt());
  }
}
