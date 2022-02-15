package com.hcl.javabasicadvanced.tostringexample;

class StudentNew{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 StudentNew(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
		 StudentNew s1=new StudentNew(101,"Raj","lucknow");  
		 StudentNew s2=new StudentNew(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}
