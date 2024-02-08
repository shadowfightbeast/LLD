package LLD_JAVA.BookMyShow.src;

// Class to represent a Booking
class Booking {
    private Movie movie;
    private Theater theater;
    private String userName;
    private BookingStatus status;

    public Booking(Movie movie, Theater theater, String userName) {
        this.movie = movie;
        this.theater = theater;
        this.userName = userName;
        this.status = BookingStatus.PENDING;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public String getUserName() {
        return userName;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void confirmBooking() {
        this.status = BookingStatus.CONFIRMED;
    }

    public void cancelBooking() {
        this.status = BookingStatus.CANCELLED;
    }
}