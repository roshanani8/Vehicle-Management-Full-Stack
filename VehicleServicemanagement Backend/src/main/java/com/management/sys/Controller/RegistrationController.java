package com.management.sys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.sys.model.User;
import com.management.sys.repository.RegisterRepository;

@RestController
@RequestMapping("/api/v2/")
public class RegistrationController {

	@Autowired
	public RegisterRepository service;
	
	
	
//	@PostMapping("/login")
//	@CrossOrigin(origins = "http://localhost:3000")
//	public User loginUser(@RequestBody User user) throws Exception {
//		String tempEmail=user.getEmail();
//		String tempPass=user.getPassword();
//		
//		User userobj=null;
//		
//		if(tempEmail !=null  && tempPass!=null) {
//			userobj=service.findByEmailAndPassword(tempEmail, tempPass);
//		}
//		if(userobj ==null) {
//			throw new Exception("Bad crendetials");
//		}
//		
//		return userobj;
//	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:3000")
	public String loginUser(@RequestBody User user) throws Exception {
		String tempEmail=user.getEmail();
		String tempPass=user.getPassword();
		
		User userobj=null;
		
		if(tempEmail !=null  && tempPass!=null) {
			userobj=service.findByEmailAndPassword(tempEmail, tempPass);
		}
		if(userobj ==null) {
			throw new Exception("Bad crendetials");
		}
		System.out.println(userobj.getRoleType());
		
		return "success";
	}
	
}
