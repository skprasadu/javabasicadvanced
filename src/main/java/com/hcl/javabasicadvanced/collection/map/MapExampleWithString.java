package com.hcl.javabasicadvanced.collection.map;


import java.util.*;
import java.util.Map.Entry;

public class MapExampleWithString {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //InterfaceName obj=new ClassName();
        //Adding elements to map
        map.put("India", "Amit");
        map.put("America", "Rahul");
        map.put("China", "Jai");
        map.put("Japan", "Amit");
        map.put("UK", "Jason");
        //Traversing Map
        Set<Map.Entry<String, String>> set = map.entrySet();//Converting to Set so that we can traverse
        Iterator<Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry<String, String> entry =  itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
            //   System.out.println(entry.getValue());
        }
        
        //Always map.get is O(1)
        System.out.println("Element UK is accessed with value " + map.get("UK"));
        
        map.put("Japan", "Krishna");
        map.put("Korea", "Kartik");
        
        System.out.println("Element UK is accessed with value " + map.get("Japan"));
        
    }
}  