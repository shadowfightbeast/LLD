import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public interface Subject {
    //method to register and unregister observers
    public  void register(Observer obj);
    public  void unregister(Observer obj);

    //method to notify observer of changes
    public  void notifyObserver();
    public  Object getUpdate(Observer obj);

}

class Mytopic implements  Subject{
    private List<Observer> observers;
    private  String message;
    private  boolean changed;
    public  Mytopic(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj==null) throw  new NullPointerException("Null observer ");
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        List<Observer>observerLocal=null;
        if(!changed) return;
        observerLocal=new ArrayList<>(this.observers);
        this.changed=false;
        for(Observer obj:observerLocal){
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }
    public void PostMessage(String msg){
        System.out.println("message posted to topic"+msg);
        this.message=msg;
        this.changed=true;
        notifyObserver();
    }
}
