package com.hcl.javabasicadvanced.oop;

public class InterfaceExample {

	public static void main(String[] args) {
		 MacBookAir mba = new MacBookAir();
		 
		 if(mba instanceof Printable) {
			 ((Printable)mba).print();
		 }

		 if(mba instanceof Drawable) {
			 
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

class MacBookAir implements Showable, Printable, Wifi {


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
	
}

class Surface implements Showable, Printable, Drawable, WiredNetwork {


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
	
}