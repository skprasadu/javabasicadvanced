package com.hcl.javabasicadvanced.collection.map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	//Stirng[] input = {"cup", "cake", "cup", "cup", "cake"};
	//String[] output = {"cup", "cake", "cup1", "cup2", "cake1"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List, Stack, Queue, Set, KeyValue/ Map
		
		String[] input = {"cup", "cake", "cup", "cup", "cake"};
		//String[] output = {"cup", "cake", "cup1", "cup2", "cake1"};
		
		//Step1: take this list, can convert into key value, where
		//the key is the word and value is
		//{"cup": 3, "cake": 2};
		Map<String, Integer> map = new HashMap<>();
		for(String word: input) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		
		//{"cup": 3, "cake": 2};
		System.out.println(map);

	}

}
