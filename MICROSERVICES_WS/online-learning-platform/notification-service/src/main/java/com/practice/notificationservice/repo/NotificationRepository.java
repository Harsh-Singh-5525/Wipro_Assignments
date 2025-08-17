package com.practice.notificationservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.practice.notificationservice.model.Notification;
public interface NotificationRepository extends JpaRepository<Notification, Long>{}
