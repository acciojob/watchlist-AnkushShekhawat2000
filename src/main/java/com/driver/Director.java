package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
    private double imdRating;

    public Director() {
    }

    public Director(String name, int numberOfMovies, double imdRating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdRating = imdRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getImdRating() {
        return imdRating;
    }

    public void setImdRating(double imdRating) {
        this.imdRating = imdRating;
    }
}
