package com.hcl.javabasicadvanced.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerNextElement {
    /* Driver Code */
    public static void main(String args[]) {
        /* StringTokenizer object */
        StringTokenizer st = new StringTokenizer("Hello Everyone: Have a: nice: day", ":");
        /* Checks if the String has any more tokens */
        while (st.hasMoreTokens()) {
            /* Prints the elements from the String */
            System.out.println(st.nextElement());
        }
    }
} 