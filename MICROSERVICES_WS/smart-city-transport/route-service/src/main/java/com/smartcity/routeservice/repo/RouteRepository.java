package com.smartcity.routeservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.smartcity.routeservice.model.Route;
public interface RouteRepository extends JpaRepository<Route, Long> { List<Route> findByModeAndActive(String mode, boolean active); }
