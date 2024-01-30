package LLD_JAVA.BookMyShow.src;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 148);
        Movie movie2 = new Movie("Titanic", "James Cameron", 195);

        // Create theaters
        Theater theater1 = new Theater("MONA", "Downtown");
        Theater theater2 = new Theater("Star Cinemas", "Midtown");

        // Add movies to theaters
        theater1.addMovie(movie1);
        theater2.addMovie(movie2);

        // Create BookMyShow service
        BookMyShowService bookMyShow = new BookMyShowService();

        // Add theaters to the service
        bookMyShow.addTheater(theater1);
        bookMyShow.addTheater(theater2);

        // Display available movies
        List<Movie> availableMovies = bookMyShow.getMoviesInAllTheaters();
        System.out.println("Available Movies:");
        for (Movie movie : availableMovies) {
            System.out.println(movie.getTitle() + " - " + movie.getDirector());
        }

        // Book a movie
        Booking booking = bookMyShow.bookMovie("Inception", "MONA", "John Doe");

        // Confirm the booking
        if (booking != null) {
            booking.confirmBooking();
            System.out.println("Booking confirmed!");
        } else {
            System.out.println("Booking failed. Movie or theater not found.");
        }

        // Display bookings
        bookMyShow.displayBookings();
    }
}
