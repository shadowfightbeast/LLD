package LLD_JAVA.Factory.ConcreteCreator.src;

public interface Shape {
    public void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Rectangle draw method");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Square draw method");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Circle draw method");
    }
}
