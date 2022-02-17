package com.hcl.javabasicadvanced.collection;

import java.util.*;

import com.hcl.javabasicadvanced.model.EmployeeImplComparable;

public class SortArrayList {
    public static void main(String args[]) {
        ArrayList<EmployeeImplComparable> al = new ArrayList<EmployeeImplComparable>();
        al.add(new EmployeeImplComparable(101, "Vineetha", 23));
        al.add(new EmployeeImplComparable(106, "swati", 27));
        al.add(new EmployeeImplComparable(105, "sindhu", 21));

        Collections.sort(al);
        for (EmployeeImplComparable emp : al) {
            System.out.println(emp.id + " " + emp.name + " " + emp.age);
        }
    }
}