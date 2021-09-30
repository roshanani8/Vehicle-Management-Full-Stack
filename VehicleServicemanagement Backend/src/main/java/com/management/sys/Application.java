package com.management.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.context.ApplicationContext;

//import com.example.demo.repository.EmployeeRepository;
//import com.management.sys.model.Service_Provider;
//import com.management.sys.repository.Service_p;

@SpringBootApplication
//Can you try to annotate @EnableJpaRespositories(basePackages="sam.springboot.dao") 
//@EnableJpaRepositories(basePackages="com.management.sys.repository")
public class Application {

	public static void main(String[] args) {
		
	//ApplicationContext cxt =
			SpringApplication.run(Application.class, args);
	
	//Service_p empr = cxt.getBean(Service_p.class);

//	EmployeeRepository empr = cxt.getBean(EmployeeRepository.class);
	
	/*
	Iterable<Service_Provider> itr = empr.findAll();
	itr.forEach(user -> {
		System.out.println(user);
	});*/
}
}
