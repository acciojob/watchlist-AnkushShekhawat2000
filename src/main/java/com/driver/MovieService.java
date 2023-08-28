package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public String addMovie(Movie movie)
    {
         String ans = movieRepository.addMovie(movie);

         return ans;
    }

    public String addDirector(Director movie)
    {
        String ans = movieRepository.addDirector(movie);

        return ans;
    }

    public String addMovieDirectorPair(String movieName, String directorName)
    {
        return movieRepository.addMovieDirectorPair(movieName,directorName);
    }

    public String deleteDirectorByName(String directorName)
    {
        return movieRepository.deleteDirectorByName(directorName);
    }

    public Movie getMovieByName(String name) {
        return movieRepository.getMovieByName(name);
    }

    public Director getDirectorByName(String director) {
        return movieRepository.getDirectorByName(director);
    }




    public List<String> getAllMovies() {
        return getAllMovies();
    }

    public List<String> getMoviesByDirectorName(String director) {
        return movieRepository.getMoviesByDirectorName(director);

    }
    public String deleteAllDirectors() {
        return movieRepository.deleteAllDirectors();
    }
}
