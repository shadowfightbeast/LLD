public interface Bollywood {
    void getMovie();
}

class BollywoodComedy implements Bollywood {
    @Override
    public void getMovie() {
        System.out.println("Bollywood comedy movie");
    }
}

class BollywoodAction implements Bollywood {
    @Override
    public void getMovie() {
        System.out.println("Bollywood action movie");
    }
}

class BollywoodHorror implements Bollywood {
    @Override
    public void getMovie() {
        System.out.println("Bollywood Horror movie");
    }
}
