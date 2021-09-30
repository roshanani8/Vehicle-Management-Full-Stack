package com.management.sys.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Homectrl {
@GetMapping("/Home")
	public String home() {
	return "This is home";
}

@GetMapping("/error")
public String error() {
	return "Error";
}



}
