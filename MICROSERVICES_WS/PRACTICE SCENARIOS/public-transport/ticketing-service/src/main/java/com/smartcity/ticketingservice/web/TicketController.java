package com.smartcity.ticketingservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import java.util.*; import com.smartcity.ticketingservice.repo.TicketRepository; import com.smartcity.ticketingservice.model.Ticket;
@RestController public class TicketController {
  private final TicketRepository repo; public TicketController(TicketRepository r){this.repo=r;}
  @PostMapping("/tickets/purchase") public Ticket purchase(@RequestBody Map<String,Object> body){ Ticket t=new Ticket(); t.setUserId(Long.valueOf(body.get("userId").toString())); return repo.save(t); }
  @PostMapping("/tickets/{id}/validate") public ResponseEntity<?> validate(@PathVariable Long id){ if(!repo.existsById(id)) return ResponseEntity.notFound().build(); return ResponseEntity.ok(Map.of("status","VALIDATED")); }
  @GetMapping("/users/{userId}/tickets") public List<Ticket> userTickets(@PathVariable Long userId){ return repo.findByUserId(userId); }
}
