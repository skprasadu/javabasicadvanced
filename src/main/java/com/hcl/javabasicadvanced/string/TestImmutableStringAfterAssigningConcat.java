package com.hcl.javabasicadvanced.string;

class TestImmutableStringAfterAssigningConcat {
    public static void main(String args[]) {
        String s = "Sachin";
        s = s.concat(" Tendulkar");
        System.out.println(s);
    }
}