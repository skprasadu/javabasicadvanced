package com.hcl.javabasicadvanced.oop.pfi;

public class TestEmployeeService implements IEmployeeService {

	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Inserting record to H2 test Db " + emp);

	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Updating record to H2 test Db " + emp);
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		return new Employee(1, "Kp", "RnD");
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

		System.out.println("Object deleted in H2 test Db");
	}
}
