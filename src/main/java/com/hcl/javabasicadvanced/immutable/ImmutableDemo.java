package com.hcl.javabasicadvanced.immutable;

import com.hcl.javabasicadvanced.model.EmployeeImplComparable;

public class ImmutableDemo {
    public static void main(String ar[]) {
        EmployeeImplComparable e = new EmployeeImplComparable("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}
