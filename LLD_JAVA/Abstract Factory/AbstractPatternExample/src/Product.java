public interface Product {
    void eat();
    void walk();
}
class Duck implements Product{
    @Override
    public void eat(){
        System.out.println("Duck eating");
    }
    public void  walk(){
        System.out.println("duck walking");
    }

}class Tiger implements Product{
    @Override
    public void eat(){
        System.out.println("tiger eating");
    }
    public void  walk(){
        System.out.println("Tiger walking");
    }

}
