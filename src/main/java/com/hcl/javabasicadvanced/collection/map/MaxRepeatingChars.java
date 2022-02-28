package com.hcl.javabasicadvanced.collection.map;

import java.util.HashMap;
import java.util.Vector;

public class MaxRepeatingChars {

	/*
	 * Return index of 1 occurrence of maximum occurring character in an input string.
	 * 
	 * For example let us say we pass a string to this function called, ‘aaafbbbdeeeda’, you need to return the 1st index of maximum character, 
	 * in this case it is ‘a’ and first index is ‘0’
	 * 
	 * Next example, ‘eeddfssses’, the value is ‘s’ and the first index is, ‘5’.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList or HashMap or Stack...
		// aaafbbbdeeeda => { 'a': 4, 'f': 1, 'b': 3, 'e': 3 } , a => 0
		
		System.out.println(maxOccuringCharIndex("aaafbbbdeeeda"));
		System.out.println(maxOccuringCharIndex("aafbbbdeeed"));
		
	}
	
	public static int maxOccuringCharIndex(String input) {
		
		//O(n)
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i =0; i < input.length(); i++) {
			int currentCount = 1;
			if(map.containsKey(input.charAt(i) )) {
				currentCount = map.get(input.charAt(i));
				currentCount++;
			}
			map.put(input.charAt(i), currentCount);
		}
		
		System.out.println(map);
		
		int maxValueIndex = -1;
		int maxCount = 0;
		for(int i =0; i < input.length(); i++) {
			int currentCount = map.get(input.charAt(i));
			
			if(currentCount > maxCount ) {
				maxCount = currentCount;
				maxValueIndex = i;
			}
		}
		
		return maxValueIndex;
	}
	
	public static int maxOccuringCharIndex(Vector<Integer> candles) {
		int lNum = 0, lCount = 0;
	    for(int i = 0; i < candles.size(); i++){
	        if(candles.get(i) > lNum){ 
	            lNum = candles.get(i);
	            lCount = 1;
	        } else if (candles.get(i) == lNum) lCount++;    
	    }
	    
	    return lCount;
	}

}
