package LLD_JAVA.BookMyShow.src;

// Class to represent the main booking service

import java.util.ArrayList;
import java.util.List;

class BookMyShowService {
    private List<Theater> theaters;
    private List<Booking> bookings;

    public BookMyShowService() {
        this.theaters = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addTheater(Theater theater) {
        theaters.add(theater);
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public List<Movie> getMoviesInAllTheaters() {
        List<Movie> allMovies = new ArrayList<>();
        for (Theater theater : theaters) {
            allMovies.addAll(theater.getMovies());
        }
        return allMovies;
    }

    public Booking bookMovie(String movieTitle, String theaterName, String userName) {
        for (Theater theater : theaters) {
            if (theater.getName().equals(theaterName)) {
                for (Movie movie : theater.getMovies()) {
                    if (movie.getTitle().equals(movieTitle)) {
                        Booking booking = new Booking(movie, theater, userName);
                        bookings.add(booking);
                        return booking;
                    }
                }
            }
        }
        return null; // Movie or theater not found
    }

    public void displayBookings() {
        for (Booking booking : bookings) {
            System.out.println("Movie: " + booking.getMovie().getTitle() +
                    " | Theater: " + booking.getTheater().getName() +
                    " | User: " + booking.getUserName() +
                    " | Status: " + booking.getStatus());
        }
    }
}