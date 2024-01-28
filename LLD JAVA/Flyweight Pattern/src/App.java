public class App {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Structural Design Pattern Used to optimize RAM usage by a lot of objects
        // which share some immutable state
        // Example:Car games with a lot of repeating objects trees, etc. e-commerce apps
        // listing and selling thousands of items
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
