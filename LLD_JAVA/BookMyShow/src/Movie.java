package LLD_JAVA.BookMyShow.src;
class Movie {
    private String title;
    private String director;
    private int durationMinutes;

    public Movie(String title, String director, int durationMinutes) {
        this.title = title;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}