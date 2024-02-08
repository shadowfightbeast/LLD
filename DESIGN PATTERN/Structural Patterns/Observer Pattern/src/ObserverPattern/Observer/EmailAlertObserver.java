package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements  NotificationAlertObserver {
    String  emailId;
    StockObservable observable;

    @Override
    public void update() {
        sendMail(emailId,"product is avaliable now");
    }

    public   EmailAlertObserver (String  emailId, StockObservable  observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    private  void sendMail(String emailId,String msg){
        System.out.println("mail sent to " + emailId);
    }

}
