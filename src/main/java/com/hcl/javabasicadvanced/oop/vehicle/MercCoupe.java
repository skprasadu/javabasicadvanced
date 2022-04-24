package com.hcl.javabasicadvanced.oop.vehicle;

public class MercCoupe extends Car {
	//void drive()
	MercCoupe() {
		
	}
	
	MercCoupe(int wheels) {
		this.wheels = wheels;
	}
	
	@Override
	void drive(int wheels) {
		// TODO Auto-generated method stub
		System.out.println("sports driving " + wheels + " wheels car");
	}
	
	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("sports driving " + this.wheels + " wheels car");
	}

}
