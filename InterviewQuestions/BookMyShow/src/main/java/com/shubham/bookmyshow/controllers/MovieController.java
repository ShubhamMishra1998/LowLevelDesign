package com.shubham.bookmyshow.controllers;

import com.shubham.bookmyshow.Movie;
import com.shubham.bookmyshow.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    private final Map<City, List<Movie>> moviesAvailableInCity;
    private final List<Movie> allMovies;

    public MovieController() {
        moviesAvailableInCity =  new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);
        moviesAvailableInCity.getOrDefault(city, new ArrayList<>()).add(movie);
    }

    public Movie getMovieByName(String name) {
        for (Movie movie : allMovies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

   public  List<Movie> getMovieByCity(City city) {
            return moviesAvailableInCity.getOrDefault(city, new ArrayList<>());
        }
    }