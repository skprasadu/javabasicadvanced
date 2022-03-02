package com.hcl.javabasicadvanced.oop;

public class InterfaceExample {

	public static void main(String[] args) {
		 Computer mba = new MacBookAir();
		 
		 if(mba instanceof Printable) {
			System.out.println(((Printable)mba).print());
		 }

		 if(mba instanceof Drawable) {
			 System.out.println(((Drawable)mba).draw());
		 }
		 
		 System.out.println("********************");
		 mba = new Surface();
		 if(mba instanceof Printable) {
			System.out.println(((Printable)mba).print());
		 }

		 if(mba instanceof Drawable) {
			 System.out.println(((Drawable)mba).draw());
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
	
}