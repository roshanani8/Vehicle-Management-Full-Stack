package com.management.sys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.sys.model.JobSheet;
import com.management.sys.repository.JobSheetRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class JobSheetController {
@Autowired
public JobSheetRepository jobRepo;

@GetMapping("/jobs")
public List<JobSheet> jobsheet(){
	return this.jobRepo.findAll();
	
}

@PostMapping("/Jobs")
public JobSheet AddJob(@RequestBody JobSheet job) {
	//return this.userService.saveUser(user);
	return this.jobRepo.save(job);
}

}
