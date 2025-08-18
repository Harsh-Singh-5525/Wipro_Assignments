package com.smartcity.userservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import java.util.*; import com.smartcity.userservice.repo.UserRepository; import com.smartcity.userservice.model.AppUser;
@RestController public class UserController {
  private final UserRepository repo; public UserController(UserRepository r){this.repo=r;}
  @PostMapping("/users") public AppUser create(@RequestBody AppUser u){ return repo.save(u); }
  @GetMapping("/users/{id}") public ResponseEntity<AppUser> get(@PathVariable Long id){ return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build()); }
}
