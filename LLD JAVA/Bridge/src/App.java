public class App {
    public static void main(String[] args) throws Exception {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();
    }
}
