package com.acme.olp.user.web;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.acme.olp.user.model.User;
import com.acme.olp.user.repo.UserRepo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
  private final UserRepo repo;
  private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

  public UserController(UserRepo repo) { this.repo = repo; }

  public static record RegisterReq(@Email String email, @NotBlank String password, @NotBlank String name, @NotBlank String role) {}

  @PostMapping("/register")
  public ResponseEntity<User> register(@RequestBody RegisterReq req) {
    User u = new User();
    u.setEmail(req.email());
    u.setPassword(encoder.encode(req.password()));
    u.setName(req.name());
    u.setRole(req.role());
    return ResponseEntity.ok(repo.save(u));
  }
}
