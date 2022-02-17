package com.hcl.javabasicadvanced.collection;

import java.util.*;

class TestJavaCollectionArrayList {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist


        list.add("RAMShyam");
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Harash");
        list.add("Alex");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}  
