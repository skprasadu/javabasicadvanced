package com.hcl.javabasicadvanced.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSimpleSortExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Hadi");
		arr.add("Margaret");
		arr.add("Joseph");
		arr.add("Hamilton");
		ArrayList<String> arr1 = arr;
		//2 references
		{
			ArrayList<String> arr2 = arr;
			//3 references
		}
		
		//2 references
		System.out.println(arr1.get(0));
		
		//Insertion Order
		for(String str: arr) {
			int z = 5;
			System.out.println("Value = " + str);
		}
		
		System.out.println("End Insertion order ********************");
		
		//Assending order Sort
		Collections.sort(arr);
		
		for(String str: arr) {
			System.out.println("Sorted Value = " + str);
		}
		System.out.println("End assending order sort ********************");
		
		//Dessending order Sort
		Collections.sort(arr,  Collections.reverseOrder());
		for(String str: arr) {
			System.out.println("Reverse Sorted Value = " + str);
		}
		System.out.println("End dessending order sort ********************");
		
		//Example of biggest length to smallest length of elements
		Collections.sort(arr,  /*something*/new ReverseLengthComparator());
		for(String str: arr) {
			System.out.println("Reverse Sorted Value = " + str);
		}
		System.out.println("End dessending length sort ********************");
	}

}

class ReverseLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.length() - o1.length();
	}	
}

/*class ReverseLengthComparatorHandlingEqualLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.length() - o1.length();
	}	
}*/

