package com.hcl.javabasicadvanced.oop.pfi;

public class ProgrammingForInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IEmployeeService es = EmployeeServiceFactory.getInstance("Dev");

		Employee emp = new Employee(1, "Jason", "HR");
		es.insert(emp);

		emp = new Employee(1, "Jake", "HR");
		es.update(emp);

		System.out.println(es.read(2));

		es.delete(2);

		es = EmployeeServiceFactory.getInstance("Test");

		emp = new Employee(1, "Jason", "HR");
		es.insert(emp);

		emp = new Employee(1, "Jake", "HR");
		es.update(emp);

		System.out.println(es.read(2));

		es.delete(2);
	}

}
