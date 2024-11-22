package com.shubham.bookmyshow;

import com.shubham.bookmyshow.controllers.MovieController;
import com.shubham.bookmyshow.controllers.TheaterController;
import com.shubham.bookmyshow.enums.City;
import com.shubham.bookmyshow.enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    MovieController movieController;
    TheaterController theaterController;;

    BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }


    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
    }

    private void createBooking(City userCity, String movieName) {


        //1. search movie by my location
        List<Movie> movies = movieController.getMovieByCity(userCity);

        //2. select the movie which you want to see. i want to see Baahubali
        Movie interestedMovie = null;
        for (Movie movie : movies) {

            if ((movie.getName()).equals(movieName)) {
                interestedMovie = movie;
            }
        }

        //3. get all show of this movie in Bangalore location
        Map<Theater, List<Show>> showsTheatreWise = theaterController.getAllShows(userCity, interestedMovie);

        //4. select the particular show user is interested in
        Map.Entry<Theater,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        //5. select the seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIDs();
        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);
            //startPayment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }



    private void initialize() {

        //create movies
        createMovies();

        //create theater with screens, seats and shows
        createTheatre();
    }

    //creating 2 theatre
    private void createTheatre() {

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        Theater inoxTheatre = new Theater();
        inoxTheatre.setId(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setCity(City.DELHI);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreens().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreens().get(0), baahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);


        Theater pvrTheatre = new Theater();
        pvrTheatre.setId(2);
        pvrTheatre.setScreens(createScreen());
        pvrTheatre.setCity(City.GURGAON);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreens().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreens().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theaterController.addTheater(inoxTheatre, City.DELHI);
        theaterController.addTheater(pvrTheatre, City.GURGAON);

    }

    private List<Screen> createScreen() {

        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);

        return screens;
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }

    //creating 100 seats
    private List<Seat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCategory(SeatCategory.CLASSIC);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCategory(SeatCategory.PREMIUM);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCategory(SeatCategory.EXECUTIVE);
            seats.add(seat);
        }

        return seats;
    }

    private void createMovies() {

        //create Movies1
        Movie avengers = new Movie();
        avengers.setId(1);
        avengers.setName("AVENGERS");
        avengers.setDuration(128);

        //create Movies2
        Movie baahubali = new Movie();
        baahubali.setId(2);
        baahubali.setName("BAAHUBALI");
        baahubali.setDuration(180);


        //add movies against the cities
        movieController.addMovie(avengers, City.GURGAON);
        movieController.addMovie(avengers, City.DELHI);
        movieController.addMovie(baahubali, City.GURGAON);
        movieController.addMovie(baahubali, City.DELHI);
    }

}
