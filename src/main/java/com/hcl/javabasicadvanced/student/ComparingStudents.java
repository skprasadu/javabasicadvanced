package com.hcl.javabasicadvanced.student;

import java.util.ArrayList;
import java.util.Collections;

class ComparingStudents {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(570, "abdhul", "london"));
        ar.add(new Student(561, "arjun", "nyc"));
        ar.add(new Student(588, "vinnie", "jaipur"));
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyid());
        System.out.println("\nSorted by id");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}