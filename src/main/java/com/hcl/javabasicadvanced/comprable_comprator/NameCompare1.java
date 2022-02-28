package com.hcl.javabasicadvanced.comprable_comprator;

import java.util.Comparator;

import com.hcl.javabasicadvanced.model.Movie;
import com.hcl.javabasicadvanced.model.MovieImplComparable;

//Class to compare Movies by name
public class NameCompare1 implements Comparator<MovieImplComparable> {
	public int compare(MovieImplComparable m1, MovieImplComparable m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

//Class to compare Movies by name
class NameCompare2 implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}