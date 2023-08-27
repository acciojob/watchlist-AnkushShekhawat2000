package com.driver;

public class Movie {

    private String name;
    private int durationInMinutes;

    private double imdRating;


    public Movie() {
    }

    public Movie(String name, int durationInMinutes, double imdRating) {

        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imdRating = imdRating;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImdRating() {
        return imdRating;
    }

    public void setImdRating(double imdRating) {
        this.imdRating = imdRating;
    }
}
