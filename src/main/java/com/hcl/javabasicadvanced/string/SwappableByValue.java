package com.hcl.javabasicadvanced.string;

import java.lang.Math;
import static java.lang.Math.abs;

public class SwappableByValue {
	public final static String nameOfPerson = "Hadi";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 6;

		System.out.printf("before swap x=%d y=%d", x, y);
		System.out.println();
		swapNumber(x, y); //In java the parameter are passed by ????

		System.out.printf("after swap x=%d y=%d", x, y);
		System.out.println();
		Integer x1 = new Integer(5);
		Integer y1 = new Integer(6);
		swap1(x1, y1);
		System.out.printf("after swap x=%d y=%d", x1, y1);
		System.out.println();
		int [] x2 = new int[]{5,6};
		swap2(x2);
		System.out.printf("after swap x=%d y=%d", x2[0], x2[1]);
		System.out.println();
		swap3(x, y);
		System.out.printf("after swap x=%d y=%d", x, y);
		System.out.println();
		/*System.out.println(Math.abs(3.567));
		System.out.println(abs(3.567));*/
		
		Swappable x5 = new Swappable();
		x5.x = 5; 
		x5.y = 6;
		swap5(x5);
		System.out.printf("after swap x=%d y=%d", x5.x, x5.y);
		System.out.println();
	}

	private static void swap5(Swappable x5) {
		// TODO Auto-generated method stub
		int temp = x5.x;
		x5.x = x5.y;
		x5.y = temp;
	}

	private static void swap3(int x, int y) {
		// TODO Auto-generated method stub
		x = x+y;
		y = x-y;
		x = x-y;
	}

	private static void swap2(int[] x2) {
		// TODO Auto-generated method stub
		int temp = x2[0];
		x2[0] = x2[1];
		x2[1] = temp;
	}

	private static void swapNumber(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
	}

	private static void swap1(Integer x, Integer y) {
		int temp = x;
		x = y;
		y = temp;
	}

	private static String x() {
		return ("" + "");
	}
}

class Swappable {
	int x;
	int y;
}
