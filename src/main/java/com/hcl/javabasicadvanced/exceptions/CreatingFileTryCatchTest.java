package com.hcl.javabasicadvanced.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreatingFileTryCatchTest {

    public static void main(String[] args) {

    	/* The bad version
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");
        }
        // providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        } finally {
        	if(pw != null) {
        		pw.close();
        	}
        }*/
    	
        try(PrintWriter pw = new PrintWriter("jtp.txt");) {
            pw.println("saved");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } 
    	
        System.out.println("File saved successfully");
    }
}  
