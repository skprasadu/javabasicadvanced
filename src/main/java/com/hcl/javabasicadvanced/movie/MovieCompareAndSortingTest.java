package com.hcl.javabasicadvanced.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Driver class
public class MovieCompareAndSortingTest {
    public static void main(String[] args) {
        ArrayList<MovieImplComparable> list = new ArrayList<MovieImplComparable>();
        list.add(new MovieImplComparable("Force Awakens", 8.3, 2015));
        list.add(new MovieImplComparable("Star Wars", 8.7, 1977));
        list.add(new MovieImplComparable("Empire Strikes Back", 8.8, 1980));
        list.add(new MovieImplComparable("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of ratingCompare
        // (2) Call Collections.sort
        // (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (MovieImplComparable movie : list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (MovieImplComparable movie : list)
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (MovieImplComparable movie : list)
            System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName() + " ");
    }
}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<MovieImplComparable> {
    public int compare(MovieImplComparable m1, MovieImplComparable m2) {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}

//Class to compare Movies by name
class NameCompare implements Comparator<MovieImplComparable> {
    public int compare(MovieImplComparable m1, MovieImplComparable m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
