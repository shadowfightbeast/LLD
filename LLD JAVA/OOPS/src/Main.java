public class Main {
    public static void main(String[] args) {
       Animal dog=new Dog(); //same as Dog dog1=new Dog();
       Animal cat=new Cat();

       dog.animalSound();
       cat.animalSound();
       //abstraction can be achieve using abstract classes or interfaces

    }
}