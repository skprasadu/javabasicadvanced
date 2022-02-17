package com.hcl.javabasicadvanced.movie;

//A class 'Movie' that implements Comparable
public class MovieImplComparable implements Comparable<MovieImplComparable> {
    private final double rating;
    private final String name;
    private final int year;

    // Used to sort movies by year
    public int compareTo(MovieImplComparable m) {
        return this.year - m.year;
    }

    // Constructor
    public MovieImplComparable(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
