package com.smartcity.vehicletrackingservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import java.util.*; import com.smartcity.vehicletrackingservice.repo.VehicleRepository; import com.smartcity.vehicletrackingservice.model.Vehicle;
@RestController public class VehicleController {
  private final VehicleRepository repo; public VehicleController(VehicleRepository r){this.repo=r;}
  @PostMapping("/telemetry") public ResponseEntity<?> ingest(@RequestBody Map<String,Object> body){ return ResponseEntity.accepted().body(Map.of("status","ACCEPTED")); }
  @GetMapping("/vehicles/{id}/position") public ResponseEntity<?> pos(@PathVariable Long id){ return repo.findById(id).<ResponseEntity<?>>map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build()); }
  @GetMapping("/routes/{id}/eta") public Map<String,Object> eta(@PathVariable Long id, @RequestParam Long stopId){ return Map.of("routeId", id, "stopId", stopId, "etaMinutes", 7); }
}
