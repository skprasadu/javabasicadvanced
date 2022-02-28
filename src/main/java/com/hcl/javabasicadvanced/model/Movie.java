package com.hcl.javabasicadvanced.model;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {
	double rating;
	String name;
	int year;

	public Movie(String string, double d, int i) {
		// TODO Auto-generated constructor stub
	}

	public double getRating() {
		// TODO Auto-generated method stub
		return rating;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return year - o.getYear();
	}

}
