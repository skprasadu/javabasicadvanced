package com.hcl.javabasicadvanced.string;

public class StringOperationValueOf {
    public static void main(String ar[]) {
        /*int a = 10;
        String s = String.valueOf(a);
        System.out.println(s + 10);*/
        
        String st1 = "Hadi"; //literals
        String st2 = "Hadi";
        
        String st3 = new String("Hadi");
        
        System.out.println(st1 == st2); //O(1)
        
        System.out.println(st1 == st3); //O(1) //false
        
        System.out.println(st1.equals(st2)); //O(1)
        
        System.out.println(st1.equals(st3)); //O(n)
        
        //Immutable
        String st4 = st1;
        System.out.println("&&&& before " + st4);
        for(int i = 0; i < 3; i++) {
        	st4 = st4 + i;
        } //there where 3 objects in the string pool and the reference st4 was 
        //assigned 3 times
        System.out.println("&&&& after " + st4);
        
        //Mutable version of string, is StringBuffer
        StringBuffer st5 = new StringBuffer(st1);
        System.out.println("&&&& before " + st5);
        for(int i = 0; i < 3; i++) {
        	st5.append( ""+i);
        } //1
        System.out.println("&&&& after " + st5);
        
        String st = "What is your name";
        			//st1="WWWhat is your name"
        
        String[] stSplit = st.split(" ");
        
        stSplit = st.split("");
        char[] ch = st.toCharArray();
        
        stSplit = st.split("your");
        
        st1 = "WW" + st;
        
        System.out.println(st1.compareTo(st)); // Lexically inferior 
        System.out.println(st.compareTo(st1)); // Lexically superior
        System.out.println(st.compareTo(st)); //if it is equals
        
        int []x1 = new int [5];
        int x2 = 5;
        System.out.println("****" + x1.getClass());
        //System.out.println("****" + x2.getClass());
        int x[ ] = new int [5];
        x= new int [10];
        
        x[5] = 1;
        x[9] = 1;
        
        int[ ][ ] y = { {1,2,3}, {4,5,6}, {7,8,9} }; 
        
        System.out.println(y[2][1]);
        
        int[ ] a0 = {1,2,3};
        int[ ] a; // = {1,2,3};
        //a =  {3,4,56}; //this syntax cannot be used after declaration
        int[ ] a1; // = new int[]{1,2,3};
        a1 = new int[]{1,2,3};

	  	for(int i : a1){
			System.out.println(i);		
		}
	  	
	  	String fname = "Krishna";
	  	String lname = "Prasad";
	  	System.out.println(String.format("My Name is %s %s", fname, lname));
	  	
	  	String removeSpaces = st.replaceAll(" " , "");
	  	System.out.println(st.replaceAll(" " , ""));
    }
}