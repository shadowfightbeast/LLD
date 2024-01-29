public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
