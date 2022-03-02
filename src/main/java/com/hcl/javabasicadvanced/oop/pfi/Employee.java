package com.hcl.javabasicadvanced.oop.pfi;

public class Employee {
	
	int id ;
	String name ;
	String department;
	
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.department;
	}
}
