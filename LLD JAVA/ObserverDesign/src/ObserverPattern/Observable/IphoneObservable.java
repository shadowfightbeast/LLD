package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements  StockObservable{
    public List<NotificationAlertObserver>observersList=new ArrayList<>();
    public  int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void NotifySubscriber() {
        for(NotificationAlertObserver observer :observersList){
            observer.update();
        }
    }
    @Override
    public void setStockCount(int newStockAdded) {
            if(stockCount==0) {
                NotifySubscriber();
            }
            stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
