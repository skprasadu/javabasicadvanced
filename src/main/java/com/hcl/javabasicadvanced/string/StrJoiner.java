package com.hcl.javabasicadvanced.string;

import java.util.StringJoiner;

public class StrJoiner {
    /* Driver Code */
    public static void main(String[] args) {
        StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
        s.add("Hello");    //String 1   
        s.add("World");    //String 2  
        System.out.println(s);  //Displays result
    }
}  