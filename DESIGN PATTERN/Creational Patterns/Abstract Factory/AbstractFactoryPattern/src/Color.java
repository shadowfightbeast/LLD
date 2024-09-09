public interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("INSIDE RED FILL METHOD");
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("INSIDE GREEN FILL METHOD");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("INSIDE BLUE FILL METHOD");
    }
}
