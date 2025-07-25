package com.teamgreen.classroom.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamgreen.classroom.client.EmployeeClient;

@RestController
@RequestMapping("/classroom/department")
public class DepartmentController {
	
	
	
	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private EmployeeClient employeeClient;
	
	@GetMapping("/greet")
	public String departmentGreat() {
		log.info("printing logger information" );
		return "Hello, calling from department";
	}
	
	
	@GetMapping("/employee")
	public String callingEmployees() {
		log.info("calling servicre for employee from department.....");
		return employeeClient.callingFromDept();
	}
}
