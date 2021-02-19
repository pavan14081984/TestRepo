package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {
	private Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	public void employee() {
		log.debug("came inside the employee method...*************************...");
		Employee employee = new Employee();
		employee.setEmpName("pavan");
		iEmployeeRepo.save(employee);
	}

}
