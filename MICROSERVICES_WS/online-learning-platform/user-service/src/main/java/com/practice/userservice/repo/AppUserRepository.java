package com.practice.userservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.userservice.model.AppUser;
public interface AppUserRepository extends JpaRepository<AppUser, Long>{}
