package com.hcl.javabasicadvanced.collection.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class SetExample {
	public static void main(String[] args) {
		
		//Sort all students by their scores
		ArrayList<Student> list = new ArrayList<>();
		
		SetExample a = new SetExample();
		list.add(a.new Student("Nick", 99));
		list.add(a.new Student("Zack", 98));
		list.add(a.new Student("Nate", 97));
		list.add(a.new Student("Trent", 96));
		list.add(a.new Student("Marissa", 100));
		
		//Collections.sort(list);
		
		//list.forEach(System.out::println);
		
		TreeSet<Student> set = new TreeSet<>();
		
		set.addAll(list);
		set.forEach(System.out::println);
		System.out.println("********************************");
	
		TreeSet<Student> set1 = new TreeSet<>(new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name) ;
		}
		});
		
		set1.addAll(list);
		set1.forEach(System.out::println);
		
		System.out.println("********************************");
		
		set1 = new TreeSet<>( (o1, o2) -> o1.name.compareTo(o2.name)) ;
			
			
		set1.addAll(list);
		set1.forEach(System.out::println);
		
		System.out.println("********************************");
		
		list.stream().sorted((o1, o2) -> o1.name.compareTo(o2.name)).forEach(System.out::println);
		
		//Functor
	}
	
	public class Student implements Comparable<Student>  {
		String name;
		Integer score;
		
		Student(String name, Integer score) {
			this.name = name;
			this.score = score;
		}

		@Override
		public int compareTo(Student s) {
			// TODO Auto-generated method stub
			return s.score - score ;
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Student s = (Student) obj;
			
			return s.score == score && s.name.equals(name) ;
		}
		
		@Override
		public String toString() {
			return name + " " + score;
		}
		
		
	}
}
