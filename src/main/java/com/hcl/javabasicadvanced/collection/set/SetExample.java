package com.hcl.javabasicadvanced.collection.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.hcl.javabasicadvanced.model.Student;

/**
 * Hello world!
 *
 */
public class SetExample {
	public static void main(String[] args) {

		// Sort all students by their scores
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(1, "Nick", 99));
		list.add(new Student(2, "Zack", 98));
		list.add(new Student(3, "Nate", 97));
		list.add(new Student(4, "Trent", 96));
		list.add(new Student(6, "Marissa", 100));

		// Collections.sort(list);

		// list.forEach(System.out::println);

		TreeSet<Student> set = new TreeSet<>();

		set.addAll(list);
		set.forEach(System.out::println);
		System.out.println("********************************");

		TreeSet<Student> set1 = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});

		set1.addAll(list);
		set1.forEach(System.out::println);

		System.out.println("********************************");

		set1 = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

		set1.addAll(list);
		set1.forEach(System.out::println);

		System.out.println("********************************");

		list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);

		// Functor
	}

}
