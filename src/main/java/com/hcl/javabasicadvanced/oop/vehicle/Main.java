package com.hcl.javabasicadvanced.oop.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		//These are objects because they are created using new keyword.
		//And objects are created in heap, and the references to objects are 
		//created in Stack
		/*Car car = new MercSedan(6);
		
		Car car1 = car;
		car.drive();
		//polymorphism
		car1.drive(5);
		
		Car car2 = new MercCoupe();
		
		Car car3 = car2;
		car2.drive();
		//polymorphism
		car3.drive(7);*/
		
		/*List<Car> list = new ArrayList<>();
		list.add(new MercCoupe());
		list.add(new MercSedan());
		list.add(new MercCoupe(8));
		list.add(new MercSedan(8));
		
		//Polymorphism
		for(Car c: list) {
			c.drive();
		}
		
		for(Car c: list) {
			c.drive(8);
		}*/
		/*Car car2 = new Car();
		car2.drive();*/
		
		//Car car2 = (Car) car.clone();
		
		//These are Primitive data types aka Abstract data types. These are ALWAY
		//created in Stack and there is no concept of reference. So in the below 
		//case it will create 2 copies
		int i = 1;
		
		int i1 = i;
		
		//String is special, Integer, Float datatypes are special
		
		List<Object> list = new ArrayList<>();
		list.add(new MercCoupeThatFloats());
		list.add(new MercCoupe());
		list.add(new MercSedenThatFloats());
		for(Object c: list) {
			((Car)c).drive();
			if(c instanceof SupportsFloating) {
				((SupportsFloating) c).canFloat();
			}
		}
		
		
	}

}
