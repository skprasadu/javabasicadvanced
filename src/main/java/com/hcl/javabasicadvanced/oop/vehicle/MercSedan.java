package com.hcl.javabasicadvanced.oop.vehicle;

public class MercSedan extends Car {
	//it has void drive() method
	MercSedan() {
		super();
	}
	
	MercSedan(int wheels) {
		super();
		this.wheels = wheels;
	}
	
	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("comfortable driving " + this.wheels + " wheels car");
	}
	
	@Override
	void drive(int wheels) {
		// TODO Auto-generated method stub
		System.out.println("comfortable driving " + wheels + " wheels car");
	}
}
