package com.hcl.javabasicadvanced.exceptions;

//This is a checked exception, we need to make it unchecked
public class AgeLessThan18Exception extends Exception {
//public class AgeLessThan18Exception extends RuntimeException {
    public AgeLessThan18Exception() {
        System.out.println("User defined Exception thrown");
    }

    public String toString() {
        return "MyException Object : Age cannot be < 18 ";
    }
}
