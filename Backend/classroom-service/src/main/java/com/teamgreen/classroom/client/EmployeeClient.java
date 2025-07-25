package com.teamgreen.classroom.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EmployeeClient {
	
	@GetExchange("employee/dept-employes")
	public String callingFromDept();

}
