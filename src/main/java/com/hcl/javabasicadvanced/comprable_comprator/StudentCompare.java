package com.hcl.javabasicadvanced.comprable_comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.hcl.javabasicadvanced.model.Student;

public class StudentCompare {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(570, "abdhul", 25));
		ar.add(new Student(561, "arjun", 36));
		ar.add(new Student(588, "vinnie", 36));
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

class Sortbyid implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.getRollno() - b.getRollno();
	}
}

class Sortbyname implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.getName().compareTo(b.getName());
	}
}