package com.hcl.javabasicadvanced.model;

public class EmployeeImplComparable implements Comparable<EmployeeImplComparable> {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int id;
    public String name;
    public int age;

    public EmployeeImplComparable(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public EmployeeImplComparable() {
        // TODO Auto-generated constructor stub
    }

    public int compareTo(EmployeeImplComparable emp) {
        if (age == emp.age)
            return 0;
        else if (age > emp.age)
            return 1;
        else
            return -1;
    }

    private String pancardNumber;

    public EmployeeImplComparable(String pancardNumber) {
        // TODO Auto-generated constructor stub
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        // TODO Auto-generated method stub
        return pancardNumber;
    }
}