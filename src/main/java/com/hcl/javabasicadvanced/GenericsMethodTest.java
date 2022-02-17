package com.hcl.javabasicadvanced;

class GenericsMethodTest {
    // generic method printArray
    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] integerArray = {5, 4, 3, 2, 1};
        Double[] doubleArray = {1.21, 22.12, 13.32};
        Character[] characterArray = {'Y', 'o', 'u', ' ', 'a', 'r', 'e', ' ', 'a', 'w', 'e', 's', 'o', 'm', 'e'};

        System.out.println("integerArray contains:");
        printArray(integerArray); // pass an Integer array

        System.out.println("\ndoubleArray contains:");
        printArray(doubleArray); // pass a Double array

        System.out.println("\n characterArray contains:");
        printArray(characterArray); // pass a Character array
    }
}