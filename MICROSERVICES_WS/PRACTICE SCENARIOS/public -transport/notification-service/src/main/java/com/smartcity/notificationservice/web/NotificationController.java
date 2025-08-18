package com.smartcity.notificationservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import java.util.*; import com.smartcity.notificationservice.repo.OutboxRepository; import com.smartcity.notificationservice.model.Outbox;
@RestController public class NotificationController {
  private final OutboxRepository repo; public NotificationController(OutboxRepository r){this.repo=r;}
  @PostMapping("/events/delay") public ResponseEntity<?> delay(@RequestBody Map<String,Object> evt){ Outbox o=new Outbox(); o.setPayload(evt.toString()); repo.save(o); return ResponseEntity.accepted().body(Map.of("status","QUEUED")); }
  @PostMapping("/events/ticket-purchased") public ResponseEntity<?> ticket(@RequestBody Map<String,Object> evt){ Outbox o=new Outbox(); o.setPayload(evt.toString()); repo.save(o); return ResponseEntity.accepted().body(Map.of("status","QUEUED")); }
  @GetMapping("/outbox") public List<Outbox> outbox(){ return repo.findAll(); }
}
