package com.hcl.javabasicadvanced.oop;

import java.util.ArrayList;

//Is this compile time or runtime? it is Compile time
public class OverloadingSample {

	public static void main(String[] args) {
		//Constuctor overloading
		OverloadExample oe = new OverloadExample();
		
		OverloadExample oe1 = new OverloadExample(1);
		
		//Method overloading
		//oe.method();
		
		//oe1.method(5);
		OverloadExample.method1(0);
		System.out.println(OverloadExample.z);
	}
	
}

class OverloadExample {
	static {
		System.out.println("Static block");
		int x = 6+7;
		System.out.println(x);
		//ArrayList inStaticBlock = new ArrayList();
	}
	
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
	
	static int z = 5;
	static void method1(int y) {
		System.out.println("1 param, No need for instance method");
		//inStaticBlock.
	}
	
	static void method1() {
		System.out.println("no param, No need for instance method");
		//inStaticBlock.
	}
	
	
	/*int method(int x) {
		
	}*/
}