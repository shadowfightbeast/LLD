public interface Bollywood {
    void getMovie();
}
class BollywoodComedy implements  Bollywood{
    @Override
    public void getMovie() {
        System.out.println("Bollywood comdedy movie");
    }
}class BollywoodAction implements  Bollywood{
    @Override
    public void getMovie() {
        System.out.println("Bollywood action movie");
    }
}class BollywoodHoror implements  Bollywood{
    @Override
    public void getMovie() {
        System.out.println("Bollywood Horror movie");
    }
}
