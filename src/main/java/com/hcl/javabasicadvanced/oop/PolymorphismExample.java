package com.hcl.javabasicadvanced.oop;

//Polymorphism ====> Overriding //Runtime
public class PolymorphismExample {

	public static void main(String[] args) {
		//Animal a = new Animal();
		
		Animal a = new Dog();
		System.out.println( a.makeNoise());
		
		System.out.println( "*******************");
		a = new GreatDane();
		System.out.println( a.makeNoise());
	}

}

 abstract class Animal {
	Animal() {
		System.out.println("Animal is called");
	}
	protected final int y = 6;
	abstract String makeNoise();
}

class Dog extends Animal {

	protected Integer y = 20;
	Dog() {
		System.out.println("Dog is called");
	}
	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		//super.y = 5;
		return "Wuff" + y + "***" + super.y;
	}
}

class GreatDane extends Dog {
	GreatDane() {
		System.out.println("GreatDane is called");
	}
	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "Wwwwuuuuufffff" + (2* this.y);
	}
}