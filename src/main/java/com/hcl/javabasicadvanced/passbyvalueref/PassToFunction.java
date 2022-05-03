package com.hcl.javabasicadvanced.passbyvalueref;

/**
 * Hello world!
 *
 */
public class PassToFunction {
	
	class Person {
		String firstName;
	}
	
	class SwapValueHolders {
		Integer x;
		Integer y;
	}
	
	public static void main(String[] args) {
		int x = 2; 
		int y = 3;
		
		//Does not Swap
		System.out.println("Before swapInts " + x + " " + y);
		swapInts(x, y);
		System.out.println("After swapInts " + x + " " + y);
		
		Integer x1 = 2;
		Integer y1 = 5;
		
		//Does not Swap
		System.out.println("Before swapIntegers " + x1 + " " + y1);
		swapIntegers(x1, y1);
		System.out.println("After swapIntegers " + x1 + " " + y1);
		
		PassToFunction a = new PassToFunction();
		
		Person p1 = a.new Person();
		Person p2 = a.new Person();
		
		p1.firstName = "K";
		p2.firstName = "P";
		
		//Does not Swap
		System.out.println("Before swapPersons " + p1.firstName + " " + p2.firstName);
		swapPersons(p1, p2);
		System.out.println("After swapPersons " + p1.firstName + " " + p2.firstName);
		
		SwapValueHolders s = a.new SwapValueHolders();
		
		s.x = 2;
		s.y = 3;
		
		//DOES SWAP
		System.out.println("Before swapObjectValues " + s.x + " " + s.y);
		swapObjectValues(s);
		System.out.println("After swapObjectValues " + s.x + " " + s.y);
		
	}

	private static void swapObjectValues(SwapValueHolders s) {
		// TODO Auto-generated method stub
		int temp = s.x;
		s.x = s.y;
		s.y = temp;
		
	}

	private static void swapPersons(Person p1, Person p2) {
		// TODO Auto-generated method stub
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}

	private static void swapIntegers(Integer x1, Integer y1) {
		// TODO Auto-generated method stub
		int temp = x1;
		x1 = y1;
		y1 = temp;
		
	}

	private static void swapInts(int x, int y) {
		// TODO Auto-generated method stub
		int temp = x;
		x = y;
		y = temp;
		System.out.println(String.format("In the function %d %d", x, y));
	}
}
