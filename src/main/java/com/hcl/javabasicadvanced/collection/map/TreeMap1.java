package com.hcl.javabasicadvanced.collection.map;

import java.util.*;

class TreeMap1 {
    public static void main(String args[]) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("India", "Amit");
        map.put("America", "Ravi");
        map.put("Singapore", "Vijay");
        map.put("Hong Kong", "Rahul");
        map.put("Hong Kong", "Krishna");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        
        System.out.println("Element UK is accessed with value " + map.get("Hong Kong"));

        
    }
}  