public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVechile();

}
class Car implements  BuilderInterface{
    private  Product product =new Product();
    @Override
    public void buildBody() {
        product.add("This is a  body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are inserted to  car");

    }

    @Override
    public void addHeadlights() {
        product.add("2 headlight added a car");
    }

    @Override
    public Product getVechile() {
     return product;
    }
}class MotorCycle implements  BuilderInterface{
    private  Product product =new Product();
    @Override
    public void buildBody() {
        product.add("This is a  body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are inserted to  car");

    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight added a car");
    }

    @Override
    public Product getVechile() {
     return product;
    }
}
