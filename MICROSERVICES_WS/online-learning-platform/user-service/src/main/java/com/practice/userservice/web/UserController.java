package com.practice.userservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import org.springframework.validation.annotation.Validated;
import java.util.*; import com.practice.userservice.repo.AppUserRepository; import com.practice.userservice.model.AppUser;
@RestController @RequestMapping("/users")
public class UserController {
  private final AppUserRepository repo;
  public UserController(AppUserRepository repo){this.repo=repo;}
  @PostMapping public AppUser create(@RequestBody @Validated AppUser u){return repo.save(u);}
  @GetMapping public List<AppUser> all(){return repo.findAll();}
  @GetMapping("/{id}") public ResponseEntity<AppUser> get(@PathVariable Long id){return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
}
