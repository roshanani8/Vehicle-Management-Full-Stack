package com.management.sys.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.sys.model.Vehicle;
import com.management.sys.repository.VehicleRepository;

@Service
public class VehicleServiceimpl implements VehicleService{

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public List<Vehicle> getAllVehicles() {
		
		return vehicleRepository.findAll();
	}

	@Transactional
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

}
