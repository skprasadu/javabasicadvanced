package com.hcl.javabasicadvanced.comprable_comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.hcl.javabasicadvanced.model.MovieImplComparable;

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
        RatingCompare1 ratingCompare = new RatingCompare1();
        Collections.sort(list, ratingCompare);
        for (MovieImplComparable movie : list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare1 nameCompare = new NameCompare1();
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

