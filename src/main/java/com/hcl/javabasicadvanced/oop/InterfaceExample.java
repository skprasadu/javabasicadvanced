package com.hcl.javabasicadvanced.oop;

public class InterfaceExample {

	public static void main(String[] args) {
		Computer c = new MacBookAir();

		printFeature(c);
		
		c = new Surface();
		printFeature(c);

	}

	private static void printFeature(Computer c) {
		// TODO Auto-generated method stub
		System.out.println("******************** features of " + c.name());
		
		System.out.println(c.type());
		if (c instanceof Printable) {
			System.out.println(((Printable) c).print());
		}

		if (c instanceof Drawable) {
			System.out.println(((Drawable) c).draw());
		}

	}

}

interface Drawable {
	String draw();
}

interface Printable {
	String print();
}

interface Showable {
	String show();
}

interface Wifi {
	String connect();
}

interface WiredNetwork {
	String wiredConnect();
}

abstract class Computer {
	abstract String type();
	abstract String name();
}

class MacBookAir extends Computer implements Showable, Printable, Wifi {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Supports color printing";
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "Supports color display";
	}

	@Override
	public String connect() {
		// TODO Auto-generated method stub
		return "Support latest wifiConnect";
	}

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "laptop";
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "MacBookAir";
	}

}

class Surface extends Computer implements Showable, Printable, Drawable, WiredNetwork {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Supports color printing";
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "Supports color display";
	}

	@Override
	public String wiredConnect() {
		// TODO Auto-generated method stub
		return "Supports latest wired";
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Supports color draw";
	}

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "tablet";
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "SurfacePro";
	}

}