package com.practice.notificationservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import java.util.*; import java.time.*;
import com.practice.notificationservice.repo.*; import com.practice.notificationservice.model.*;
@RestController @RequestMapping("/notifications")
public class NotificationController {
  private final NotificationRepository repo;
  public NotificationController(NotificationRepository r){this.repo=r;}
  @PostMapping public Notification create(@RequestBody Notification n){ return repo.save(n); }
  @GetMapping public java.util.List<Notification> all(){ return repo.findAll(); }
  @PostMapping("/{id}/send")
  public ResponseEntity<?> send(@PathVariable Long id){
    return repo.findById(id).map(n->{
      if(!n.isSent() && !n.getSendOn().isAfter(LocalDate.now())){ n.setSent(true); repo.save(n); return ResponseEntity.ok(Map.of("status","SENT")); }
      else return ResponseEntity.ok(Map.of("status","PENDING"));
    }).orElse(ResponseEntity.notFound().build());
  }
}
