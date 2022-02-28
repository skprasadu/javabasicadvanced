package com.hcl.javabasicadvanced.comprable_comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.hcl.javabasicadvanced.model.Student;

public class ComparingStudents {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(570, "abdhul", 24));
        ar.add(new Student(561, "arjun", 26));
        ar.add(new Student(588, "vinnie", 45));
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

