public interface Hollywood {
    void getMovie();
}
class HollywoodComedy implements  Hollywood{
    @Override
    public void getMovie() {
        System.out.println("Hollywood comdedy movie");
    }
}class HollywoodAction implements  Hollywood{
    @Override
    public void getMovie() {
        System.out.println("Hollywood action movie");
    }
}class HollywoodHoror implements  Hollywood{
    @Override
    public void getMovie() {
        System.out.println("Hollywood Horror movie");
    }
}
