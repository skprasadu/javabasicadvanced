package com.hcl.javabasicadvanced.collection.list;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Krishna", "Aditya", "Vani", "Joseph"};
		
		for(String str : arr) {
			System.out.println(str);
		}
		System.out.println("Unordered array ***********" );

		//O complexity for this is O(n)
		System.out.println("Linear Search *********** " + linSearch(arr, "Aditya") );
		System.out.println("Linear Search *********** " + linSearch(arr, "Hadi") );
		
		//This will not work, because it is unsorted
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Vani") );

		Arrays.sort(arr);
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		System.out.println("Ordered array ***********" );
		
		//O complexity for this is O(n)
		System.out.println("Linear Search *********** " + linSearch(arr, "Aditya") );
		System.out.println("Linear Search *********** " + linSearch(arr, "Hadi") );
		
		//O complexity for this is O(log(n))
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Aditya") );
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Vani") );
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Hadi") );

	}

	private static int linSearch(String[] arr, String key) {
		// TODO Auto-generated method stub
		int idx = 0;
		for(String k: arr) {
			if(k.equals(key)) {
				return idx;
			}
			idx++;
		}
		return -1;
	}

}
