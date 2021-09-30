package com.management.sys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.sys.model.User;
import com.management.sys.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle , Integer>{
	List<Vehicle> findAllByUser(User user);

    Vehicle findVehicleByPlateNUmber(String plateNumber);

    List<Vehicle> getVehiclesByUser(User user);

    Vehicle getVehicleByVehicleId(Long vehicleId);
}

