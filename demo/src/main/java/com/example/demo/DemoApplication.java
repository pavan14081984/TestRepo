package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Test 
 */
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeController employeeController;
	
	private Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

	public void run(String... args) throws Exception {
		log.info("came inside the run method......");
		employeeController.employee();
		
	}

}
