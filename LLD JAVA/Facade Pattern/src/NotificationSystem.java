
public class NotificationSystem {

    public void sendEmail(User user, Object ticketNumber) {
        System.out.println(
                "Email Notification send to email:" + user.email + "TICKET NUMBER FOR MOVIE IS " + ticketNumber);
    }

    public void sendSms(User user, Object ticketNumber) {
        System.out.println("PHONE SMS Notification send to user:" + user.name);
    }

}
