package com.shubham.bookmyshow.controllers;

import com.shubham.bookmyshow.Movie;
import com.shubham.bookmyshow.Show;
import com.shubham.bookmyshow.Theater;
import com.shubham.bookmyshow.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theater>> cityVsTheaters;
    List<Theater> allTheaters;


    public TheaterController() {
        cityVsTheaters = new HashMap<>();
        allTheaters = new ArrayList<>();
    }

    public void addTheater(Theater theater, City city) {
        allTheaters.add(theater);
        cityVsTheaters.getOrDefault(city, new ArrayList<>()).add(theater);
    }

    public Map<Theater, List<Show>> getAllShows(City city, Movie movie) {
        Map<Theater, List<Show>> showsByTheater = new HashMap<>();
        List<Theater> theaters = cityVsTheaters.getOrDefault(city, new ArrayList<>());

        for(Theater theater : theaters) {
            List<Show> movieShows = new ArrayList<>();
            List<Show> allShows = theater.getShows();

            for(Show show : allShows) {
                if(show.getMovie().getId()==movie.getId()) {
                    movieShows.add(show);
                }
            }

            if(!movieShows.isEmpty()) {
                showsByTheater.put(theater, movieShows);
            }

        }

        return showsByTheater;


    }
}
