package com.hcl.javabasicadvanced.oop.pfi;

public class EmployeeServiceFactory {

	static IEmployeeService getInstance(String environment) {

		return environment.equals("Dev") ? new AppEmployeeService() : new TestEmployeeService();

	}
}
