package com.management.sys.service;

import java.util.List;

import com.management.sys.model.Vehicle;

public interface VehicleService {

	List<Vehicle> getAllVehicles();
	Vehicle saveVehicle(Vehicle vehicle);
	
}
