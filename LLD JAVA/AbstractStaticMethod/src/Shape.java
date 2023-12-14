public interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public Rectangle(int i, int j) {
    }

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
    public Circle(int i) {
    }

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("inside Circle draw method");
    }
}
