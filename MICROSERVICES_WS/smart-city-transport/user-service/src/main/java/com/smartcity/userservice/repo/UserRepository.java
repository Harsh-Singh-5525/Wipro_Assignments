package com.smartcity.userservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.smartcity.userservice.model.AppUser;
public interface UserRepository extends JpaRepository<AppUser, Long>{}
