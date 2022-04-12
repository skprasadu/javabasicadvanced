package com.hcl.javabasicadvanced.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The keys ensures insertion order O(n) search
		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("fruit", "mango");
		map.put("vegitable", "potato");
		map.put("bird", "crow");

		// The keys ensures sorted order, O(log n) search
		TreeMap<String, String> map1 = new TreeMap<>();

		map1.put("fruit", "mango");
		map1.put("vegitable", "potato");
		map1.put("bird", "crow");

		// The keys ensures any order as long as the search of O(1) is achieved
		HashMap<String, String> map2 = new HashMap<>();

		map2.put("fruit", "mango");
		map2.put("vegitable", "potato");
		map2.put("bird", "crow");
		
		//map2.get("bird") // O(1)

	}

}
