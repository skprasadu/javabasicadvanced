package com.hcl.javabasicadvanced.comprable_comprator;

import java.util.Comparator;

import com.hcl.javabasicadvanced.model.Student;

public class Sortbyname implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.getName().compareTo(b.getName());
	}
}