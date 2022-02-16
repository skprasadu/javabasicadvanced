package com.hcl.javabasicadvanced.collection;

import java.util.*;

import com.hcl.javabasicadvanced.model.Employee;

public class SortArrayList {
    public static void main(String args[]) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "Vineetha", 23));
        al.add(new Employee(106, "swati", 27));
        al.add(new Employee(105, "sindhu", 21));

        Collections.sort(al);
        for (Employee emp : al) {
            System.out.println(emp.id + " " + emp.name + " " + emp.age);
        }
    }
}