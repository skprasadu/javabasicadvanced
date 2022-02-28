package com.hcl.javabasicadvanced.misc;

import com.hcl.javabasicadvanced.model.EmployeeImplComparable;

public class EmployeeGetAndSetTest {

    public static void main(String args[]) {
        EmployeeImplComparable e = new EmployeeImplComparable();
        e.setName("Shweta");
        System.out.println(e.getName());
    }

}
