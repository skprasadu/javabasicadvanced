package com.hcl.javabasicadvanced.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.hcl.javabasicadvanced.model.EmployeeImplComparable;
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
		list.add(new Student(6, "Marissa", 100));

		//Sort by age
		/*Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});*/
		
		//Sort by name
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		});

		/*list.forEach(System.out::println);

		TreeSet<Student> set = new TreeSet<>();

		set.addAll(list);
		set.forEach(System.out::println);
		System.out.println("********************************");*/

		//Sort during insertion
		TreeSet<Student> set1 = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});

		set1.addAll(list);
		set1.forEach(System.out::println);
		
		//O(log N)
		System.out.println(set1.contains(new Student(4, "Trent", 96)));

		HashSet<Student> set2 = new HashSet<>();
		set2.addAll(list);
		
		//O(1)
		System.out.println(set2.contains(new Student(4, "Trent", 96)));

		/*System.out.println("********************************");

		set1 = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

		set1.addAll(list);
		set1.forEach(System.out::println);

		System.out.println("********************************");

		list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		*/
		// Functor
		TreeSet<EmployeeImplComparable> set5 = new TreeSet<>();
		
		set5.add(new EmployeeImplComparable(1,"Krishna", 50));
		set5.add(new EmployeeImplComparable(2,"Alisha", 10));
		set5.add(new EmployeeImplComparable(3,"Zack", 5));
	}

}
