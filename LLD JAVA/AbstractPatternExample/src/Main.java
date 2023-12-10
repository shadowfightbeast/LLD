public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory1=new AnimalFactory();
        Product animal1=animalFactory1.getAnimal("DUCK");
        animal1.eat();
        animal1.walk();
    }
}