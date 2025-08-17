package com.smartcity.vehicletrackingservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import com.smartcity.vehicletrackingservice.model.Vehicle;
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{}
