package com.hcl.javabasicadvanced.oop;

public class OverloadingSample {

	//Constuctor overloading
	OverloadExample oe = new OverloadExample();
	
	OverloadExample oe1 = new OverloadExample(1);
	
	//Method overloading
}

class OverloadExample {
	OverloadExample() {
		System.out.println("No Args Constructor called");
	}
	
	OverloadExample(int x) {
		System.out.println("One Arg Constructor called");
	}
	
	void method() {
		System.out.println("No args method");
	}
	
	void method(int y) {
		System.out.println("One args method");
	}
	
	/*int method(int x) {
		
	}*/
}