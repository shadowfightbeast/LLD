public class App {
    public static void main(String[] args) throws Exception {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();

        System.out.println("");

        // image will not be loaded from disk
        image.display();
    }
}
