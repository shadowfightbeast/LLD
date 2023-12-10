public class Main {
    public static void main(String[] args) {
        Mytopic topic=new Mytopic();
        Observer obj1=new MytopicSubscriber("Obj1");
        Observer obj12=new MytopicSubscriber("Obj2");
        Observer obj3=new MytopicSubscriber("Obj3");
    }
}