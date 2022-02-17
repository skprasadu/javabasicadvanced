package com.hcl.javabasicadvanced.string;

public class StrJoin {
    /* Driver Code */
    public static void main(String[] args) {
        String s1 = "Hello";    //String 1
        String s2 = " World";    //String 2
        String s = String.join("", s1, s2);   //String 3 to store the result
        System.out.println(s);  //Displays result
    }
}  