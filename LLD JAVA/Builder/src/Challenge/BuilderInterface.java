package Challenge;

public interface BuilderInterface {
    public  String name();
    public Packing packing();
    public  double price();
}

abstract  class Burger implements  BuilderInterface{
    @Override
    public Packing packing() {
        System.out.println("you have veg burger");
    }

    @Override
    public String name() {
        System.out.println("you have non veg burger");
    }

    @Override
    public double price() {
        return 0;
    }
}
