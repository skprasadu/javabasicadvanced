package com.hcl.javabasicadvanced.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo {

    public static void main(String args[]) {
        File file = new File("./file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}