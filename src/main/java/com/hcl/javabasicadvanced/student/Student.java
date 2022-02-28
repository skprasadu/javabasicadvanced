package com.hcl.javabasicadvanced.student;

import java.util.*;
import java.lang.*;
import java.io.*;

class Student {
    int id;
    String name, address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.address;
    }
}

class Sortbyid implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.id - b.id;
    }
}

class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
} 
