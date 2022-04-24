package com.hcl.javabasicadvanced.oop.vehicle;

public class MercSuv extends Car {

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("I am a big van with " + wheels + " wheels" );
	}

	@Override
	void drive(int wheels) {
		// TODO Auto-generated method stub
		System.out.println("I am a big van with " + this.wheels + " wheels" );
	}

}
