import java.util.Random;

public class TicketSystem {

    public void createTicket(int i, User user, String string) {
        System.out.println("ticket is created for movie..");
        System.out.println("Make card payments in just one click..");
    }

    public Object getTicketNumber() {
        Random random = new Random();
        int ticketNumber = random.nextInt(1000); // Change 1000 to the desired range

        return ticketNumber;
    }

    public boolean validateAvailability(String string) {
        return true;
    }

}
