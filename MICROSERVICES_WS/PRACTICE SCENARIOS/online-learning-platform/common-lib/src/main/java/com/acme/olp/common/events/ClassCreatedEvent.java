package com.acme.olp.common.events;

import java.time.Instant;

public record ClassCreatedEvent(Long courseId, Long teacherId, Instant startAt, String meetingUrl) {}
