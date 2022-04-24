package com.hcl.javabasicadvanced.oop.vehicle;

public interface SupportsFloating {
	void floater();
	
	default void canFloat() {
		System.out.println("I can also float");
	}
}
