package SingletonLazyIMP;

public class TestSingleton {
    public  static  void main(String args[]){
        Singleton s=Singleton.getInstance();
        //set the data value
        s.setData(123);
        System.out.println("first refrence " + s);
        System.out.println("singleton data value is " + s.getData());
        //get another refrence to the singleton is it the same object
        s=null;
        s=Singleton.getInstance();
        System.out.println("first refrence " + s);
        System.out.println("singleton data value is " + s.getData());
    }
}
