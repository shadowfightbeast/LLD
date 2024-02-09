package LLD_JAVA.Factory.AbstractCreator.src;
public class Main {
    public static void main(String[] args) {

        // get an object of circle and calls its draw method
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();// cll draw method of circle

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();

    }
}