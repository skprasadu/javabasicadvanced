package com.hcl.javabasicadvanced.collection.stack;

import java.util.Stack;

public class MatchingBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(bracesMatched("{{}{}{}}")); // Should return true
		System.out.println(bracesMatched("}{}{}{}{")); // Should return false
		System.out.println(bracesMatched("{}{}{}{")); // Should return false
		System.out.println(bracesMatched("{}}{{}")); //Should return false
		System.out.println(bracesMatched("{{{{}}}{}{}}")); // Should return true
	}

	private static boolean bracesMatched(String string) {
		// TODO Auto-generated method stub
		// ArrayList or HashMap or Stack or Queue
		// Do we need a datastrucure at all??

		// There are 3 ways of solving this problem
		// Bad way: Keep 2 counters one for opening braces and one for closing brace.
		// If they are equal it will work, but this is buggy

		// Bad way 2: Add 1 when you see open brace and remove when you see close brace,
		// finally the counter is zero

		// Use Stack: When you see '{' push that to stack when you see '}' pop from
		// stack

		Stack<Character> stack = new Stack<>();
		try {
			for (int i = 0; i < string.length(); i++) {
				switch(string.charAt(i)) {
				case '{':
					stack.push('{');
					break;
				case '}':
					stack.pop();
					break;
				}
				
			}
		} catch (Exception e) {
			return false;
		}

		return stack.empty();
	}

}
