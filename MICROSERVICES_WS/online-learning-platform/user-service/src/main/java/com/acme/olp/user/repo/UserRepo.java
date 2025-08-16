package com.acme.olp.user.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.acme.olp.user.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
