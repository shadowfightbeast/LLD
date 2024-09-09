public interface Hollywood {
    void getMovie();
}

class HollywoodComedy implements Hollywood {
    @Override
    public void getMovie() {
        System.out.println("Hollywood comedy movie");
    }
}

class HollywoodAction implements Hollywood {
    @Override
    public void getMovie() {
        System.out.println("Hollywood action movie");
    }
}

class HollywoodHorror implements Hollywood {
    @Override
    public void getMovie() {
        System.out.println("Hollywood Horror movie");
    }
}
