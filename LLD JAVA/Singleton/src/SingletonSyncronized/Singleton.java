package SingletonSyncronized;

public class Singleton {
    private static Singleton uniqueInstance =null;

    private int  data=0;
    //the singleton constructor .note that it is private no client can instantiate a singleton object
    private  Singleton(){}
    //by adding synchronized keyword to getInstance() ,
    // we force every  thread to wait its turn before   it can enter the method
    public   static synchronized Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return  uniqueInstance;
    }
    //add a setter method to set the data
    public  void setData(int val){
        data=val;
    }
    public  int getData(){
        return  data;
    }
}
