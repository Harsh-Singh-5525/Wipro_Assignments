package com.smartcity.routeservice.web;
import org.springframework.web.bind.annotation.*; import java.util.*; import com.smartcity.routeservice.repo.RouteRepository; import com.smartcity.routeservice.model.Route;
@RestController @RequestMapping("/routes")
public class RouteController {
  private final RouteRepository repo;
  public RouteController(RouteRepository repo){this.repo=repo;}
  @GetMapping public List<Route> list(@RequestParam String mode, @RequestParam(defaultValue="true") boolean active){ return repo.findByModeAndActive(mode, active); }
  @PostMapping public Route create(@RequestBody Route r){ return repo.save(r); }
  @GetMapping("/{id}") public java.util.Optional<Route> get(@PathVariable Long id){ return repo.findById(id); }
}
