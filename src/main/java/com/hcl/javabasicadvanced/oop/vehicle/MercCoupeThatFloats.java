package com.hcl.javabasicadvanced.oop.vehicle;

public class MercCoupeThatFloats extends MercCoupe implements SupportsFloating {
	
	public MercCoupeThatFloats() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MercCoupeThatFloats(int wheels) {
		// TODO Auto-generated constructor stub
		super(wheels);
	}
	
	public void floater() {
		System.out.println("I can also float");
	}
}
