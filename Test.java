
class Animal {
    public void sayHello() {
        System.out.println("hi animals");
    }
}

class Cat extends Animal {

    @Override
    public void sayHello() {
        System.out.println("meow");
    }

    public void doDance() {
        System.out.println("spinning");
    }

}

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.sayHello();

        Cat cat1 = new Cat();
        cat1.sayHello();
        cat1.doDance();

        Animal cat2 = new Cat();
        cat2.sayHello();
        // cat2.doDance(); //here we doDance is not allowed because cat2 object has
        // Animal class reference so we are only allowed to access the animal methods
        // but at runtime the object is created on Cat class

        // only in abstract class we can create the abstract methods

        // methods have definition called concrete methods and if methods doesn't have
        // methods called abstract methods eg:public abstract void sayHello();
        // we cannot create an object of abstract class but we can give reference
        // ❌Animal animal1 = new Animal(); ✅Animal cat =new Cat();

    }
}
