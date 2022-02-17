package com.hcl.javabasicadvanced.string;

public class StringOperationDotIntern {
    public static void main(String[] ar) {
        String s = "Sachin";
        String s2 = s.intern();
        System.out.println(s2);//Sachin
    }
} 