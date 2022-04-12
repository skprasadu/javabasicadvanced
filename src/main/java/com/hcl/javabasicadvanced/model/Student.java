package com.hcl.javabasicadvanced.model;

//Plain old java objects (POJO)
public class Student {
	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollno+ this.name.hashCode()+ this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s = (Student) obj;
		return s.age == age && s.rollno == rollno && s.name.equals(name);
	}

}
