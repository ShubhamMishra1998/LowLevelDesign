package com.shubham.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int id;
    Movie movie;
    int startTime;
    Screen screen;
    List<Integer> bookedSeatIDs = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSeatIDs() {
        return bookedSeatIDs;
    }

    public void setBookedSeatIDs(List<Integer> bookedSeatIDs) {
        this.bookedSeatIDs = bookedSeatIDs;
    }
}
