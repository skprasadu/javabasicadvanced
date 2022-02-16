package com.hcl.javabasicadvanced.collection;

import java.util.*;

public class TestJavaCollectionTreeSet {
    public static void main(String args[]) {
        //Creating and adding elements
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add("Ajay");
        set.add("Vijay");
        set.add("Alex");
        set.add("Harash");
        set.add("Alliena");
        set.add("Alex");
        set.add("Harash");
        set.add("Alliena");
        //traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}  