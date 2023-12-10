public class Main {
    public static void main(String[] args) {
        //abstraction can be achieve using abstract classes or interfaces
            Animal dog=new Dog();
            Animal2 cat=new Cat();

            cat.animalSound();
            cat.animalSleep();

            dog.animalSound();
            dog.animalSleep();
    }
}