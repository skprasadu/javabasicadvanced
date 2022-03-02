package com.hcl.javabasicadvanced.oop;

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		
		e.setId(1);
		e.setName("Krishna");
		e.setPhone("1234567890");
		
		System.out.println(e.getId() + " " + e.getName() + " " + e.getPhone() );

	}

}

class Employee {
	private int id;
	private String name;
	private String phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}