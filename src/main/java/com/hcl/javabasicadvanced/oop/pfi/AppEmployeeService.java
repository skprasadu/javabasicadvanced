package com.hcl.javabasicadvanced.oop.pfi;

public class AppEmployeeService implements IEmployeeService {

	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Inserting record to SQL Server Development Db " + emp);

	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Updating record to SQL Server Development Db " + emp);
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		return new Employee(2, "Kp", "RnD");
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

		System.out.println("Object deleted in SQL Server Dev Db");
	}

}
