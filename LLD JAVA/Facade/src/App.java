public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("marvel+fan", "mk@gmail.com", 12345678);
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.createBooking(user);
    }
}
