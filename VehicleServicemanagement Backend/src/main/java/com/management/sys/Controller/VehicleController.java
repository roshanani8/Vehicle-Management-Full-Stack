package com.management.sys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.sys.model.Vehicle;
import com.management.sys.repository.VehicleRepository;
import com.management.sys.service.VehicleService;
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class VehicleController {
@Autowired
public VehicleRepository vehicleRepo;

@Autowired
private VehicleService vehicleService;

@GetMapping("/vehicles")
public List<Vehicle> findVehicles(){
	return this.vehicleRepo.findAll();
}

@PostMapping("/vehicles")
public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
	return this.vehicleRepo.save(vehicle);
}

}
