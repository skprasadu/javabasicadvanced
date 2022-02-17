package com.hcl.javabasicadvanced.tostringexample;

class StudentToStringMethod {
    int rollno;
    String name;
    String city;

    StudentToStringMethod(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {//overriding the toString() method
        return rollno + " " + name + " " + city;
    }

    public static void main(String args[]) {
        StudentToStringMethod s1 = new StudentToStringMethod(101, "Raj", "lucknow");
        StudentToStringMethod s2 = new StudentToStringMethod(102, "Vijay", "ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
