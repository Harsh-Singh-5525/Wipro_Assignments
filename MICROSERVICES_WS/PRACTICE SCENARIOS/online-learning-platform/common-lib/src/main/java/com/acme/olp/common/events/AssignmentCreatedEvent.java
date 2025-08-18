package com.acme.olp.common.events;

import java.time.Instant;

public record AssignmentCreatedEvent(Long assessmentId, Long courseId, Instant dueAt) {}
