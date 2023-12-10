package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove (NotificationAlertObserver observer);
    public void NotifySubscriber();
    public void  setStockCount(int newStockAdded);
    public int getStockCount();
}
