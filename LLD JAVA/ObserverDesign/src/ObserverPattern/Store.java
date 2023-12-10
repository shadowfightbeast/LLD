package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public  static  void main(String args[]){

    StockObservable iphoneObservable =new IphoneObservable();
    NotificationAlertObserver observer1=new EmailAlertObserver("xzy@email.com",iphoneObservable);
    NotificationAlertObserver observer2=new EmailAlertObserver("xzy2@email.com",iphoneObservable);
    NotificationAlertObserver observer3=new MobileAlertObserver("9122142139",iphoneObservable);

    iphoneObservable.add(observer1);
    iphoneObservable.add(observer2);
    iphoneObservable.add(observer3);

    iphoneObservable.getStockCount();
    iphoneObservable.setStockCount(10);
    }
}
