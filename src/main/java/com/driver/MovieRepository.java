package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {

    HashMap<String , Movie> movieDb = new HashMap<>();

    HashMap<String , Director> directorDb = new HashMap<>();

    HashMap<String , List<String> >movieDirectorPairMapping = new HashMap<>();



    public String addMovie(Movie movie)
    {
         String key = movie.getName();
         movieDb.put(key,movie);

         return "Movie added successfully";
    }

    public String addDirector(Director director)
    {
        String key = director.getName();
        directorDb.put(key,director);

        return "Director added successfully";
    }




    public String addMovieDirectorPair(String movieName, String directorName) {
         if(movieDb.containsKey(movieName) && directorDb.containsKey(directorName)  )
         {

             List<String> currentMovies = new ArrayList<String>();
             if(movieDirectorPairMapping.containsKey(directorName))
             {
                 currentMovies = movieDirectorPairMapping.get(directorName);
                 currentMovies.add(movieName);
                 movieDirectorPairMapping.put(directorName,currentMovies);
             }



         }

           return "connected them successfully";
    }


    public Movie getMovieByName(String movie)
    {
        return movieDb.get(movie);
    }

    public Director getDirectorByName(String director) {
        return directorDb.get(director);
    }
    public List<String> getMoviesByDirectorName(String directorName)
    {
        List<String> movielist = new ArrayList<>();
        if(movieDirectorPairMapping.containsKey(directorName))
        {
            movielist = movieDirectorPairMapping.get(directorName);
        }

        return movielist;
    }

    public List<String> getAllMovies() {
        List<String> allMovies = new ArrayList<>();

        for (Movie movie : movieDb.values()) {
            allMovies.add(movie.getName());
        }

        return allMovies;
    }

    public String deleteDirectorByName(String directorName) {
        // directorDb
        List<String> movies = new ArrayList<>();
        if(movieDirectorPairMapping.containsKey(directorName))
        {
            movies = movieDirectorPairMapping.get(directorName);

            for(String movie : movies )
            {
                if(movieDb.containsKey(movie))
                {
                    movieDb.remove(movie);
                }
            }

            movieDirectorPairMapping.remove(directorName);

        }

        if(directorDb.containsKey(directorName))
        {
            directorDb.remove(directorName);
        }

        return "Director removed successfuly";

    }

    public String  deleteAllDirectors()
    {
        HashSet<String> movieSet = new HashSet<>();
        for(String directorName: directorDb.keySet())
        {
            for(String movie :  movieDirectorPairMapping.get(directorName))
            {
                movieSet.add(movie);
            }
        }

        for(String movie : movieSet)
        {
            if(movieDb.containsKey(movie))
            {
                movieDb.remove(movie);
            }
        }

        return "Add directors deleted";
    }








}
