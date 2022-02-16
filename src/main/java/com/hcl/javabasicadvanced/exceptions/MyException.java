package com.hcl.javabasicadvanced.exceptions;

public class MyException extends Exception {
    public MyException() {
        System.out.println("User defined Exception thrown");
    }

    public String toString() {
        return "MyException Object : Age cannot be < 18 ";
    }
}
