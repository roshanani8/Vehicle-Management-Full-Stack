package com.management.sys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.sys.model.JobSheet;
import com.management.sys.model.User;
import com.management.sys.model.Vehicle;
import com.management.sys.repository.JobSheetRepository;
import com.management.sys.repository.UserRepository;
import com.management.sys.repository.VehicleRepository;
import com.management.sys.service.UserService;
import com.management.sys.service.VehicleService;


@Component
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class UserController {


//	@Autowired
//	public UserService userService;
	
@Autowired
public UserRepository userRepo;



@Autowired
public JobSheetRepository jobRepo;

@GetMapping("/users")
public List<User> findAllUsers(){
	
	return this.userRepo.findAll();
}

@PostMapping("/users")
public User addUser(@RequestBody User user) {
	//return this.userService.saveUser(user);
	return this.userRepo.save(user);
}
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

@GetMapping("/jobs")
public List<JobSheet> findJobSheets(){
	return this.jobRepo.findAll();
	
}

@PostMapping("/jobs")
public JobSheet addJob(@RequestBody JobSheet job) {
	return this.jobRepo.save(job);
}





 }

