package com.hcl.javabasicadvanced.oop.vehicle;

public abstract class Car {

	protected int wheels = 4;
	
	abstract void drive();
	
	abstract void drive(int wheels);
	
	/*int drive(int wheels) {
		System.out.println("I go on " + wheels + " wheels");
		return 4;
	}*/
	
	/*
	//parameterized constructor
	public Car(int wheels) {
		super();
		this.setWheels(wheels);
		
	}
	
	//no args constructor
	//Package score/ aka default
	Car() {
		
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}*/
}
