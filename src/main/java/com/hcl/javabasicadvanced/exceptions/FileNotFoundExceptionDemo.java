package com.hcl.javabasicadvanced.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

    public static void main(String args[])   {
    	//NullPointerException, ArrayIndexOutOfBoundException, EmptyStackException are RuntimeException
        int[] x = {1,2}; 
        
        System.out.println(x[5]);
        
        File file = new File("./file.txt");
        
        //Option1
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        	if(fr != null) {
        		try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        
        //Option2, try with resources
        try(FileReader fr1 = new FileReader(file);) {
        	//do something with the file
        } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
            

    }
}