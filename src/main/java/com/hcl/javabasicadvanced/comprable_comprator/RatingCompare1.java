package com.hcl.javabasicadvanced.comprable_comprator;

import java.util.Comparator;

import com.hcl.javabasicadvanced.model.Movie;
import com.hcl.javabasicadvanced.model.MovieImplComparable;

//Class to compare Movies by ratings
public class RatingCompare1 implements Comparator<MovieImplComparable> {
	public int compare(MovieImplComparable m1, MovieImplComparable m2) {
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}

//Class to compare Movies by ratings
class RatingCompare2 implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}

