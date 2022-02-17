package com.hcl.javabasicadvanced.tostringexample;

class StudentWithoutToStringMethod {
    int rollno;
    String name;
    String city;

    StudentWithoutToStringMethod(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {
        StudentWithoutToStringMethod s1 = new StudentWithoutToStringMethod(101, "Raj", "lucknow");
        StudentWithoutToStringMethod s2 = new StudentWithoutToStringMethod(102, "Vijay", "ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
