package com.hcl.javabasicadvanced.oop;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Animal {
	abstract String makeNoise();
}

class Dog extends Animal {

	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "Wuff";
	}
}

class GreatDane extends Dog {
	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "Wwwwuuuuufffff";
	}
}