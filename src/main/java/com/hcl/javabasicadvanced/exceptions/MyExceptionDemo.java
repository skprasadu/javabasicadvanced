package com.hcl.javabasicadvanced.exceptions;

class MyExceptionDemo{
	static int flag=0;
	public static void main(String args[]) throws AgeLessThan18Exception {
		try {
			int age=14;
			if(age < 18) {
				throw new AgeLessThan18Exception();
			}
		} catch(NumberFormatException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		
		if(flag==0)
			System.out.println("Everything is fine");
	}
}