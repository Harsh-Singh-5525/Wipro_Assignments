package com.smartcity.notificationservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.smartcity.notificationservice.model.Outbox;
public interface OutboxRepository extends JpaRepository<Outbox, Long>{}
