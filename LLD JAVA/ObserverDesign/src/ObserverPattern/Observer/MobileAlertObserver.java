package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements  NotificationAlertObserver{
   String mobileNumber;
   StockObservable observable;
   public  MobileAlertObserver(String mobileNumber,StockObservable observable){
       this.observable=observable;
       this.mobileNumber=mobileNumber;
   }
    @Override
    public void update() {
        sendMsgOnline(mobileNumber,"product is  avalaible now");
    }
    private  void sendMsgOnline(String mobileNumber,String msg){
        System.out.println("message sent to " + mobileNumber);
    }
}
