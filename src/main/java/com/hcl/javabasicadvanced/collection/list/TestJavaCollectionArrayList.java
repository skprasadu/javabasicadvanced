package com.hcl.javabasicadvanced.collection.list;

import java.util.*;

class TestJavaCollectionArrayList {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist

		list.add("RAMShyam");
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Harash");
		list.add("Alex");
		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Index 2 = " + list.get(2));
	}
}
