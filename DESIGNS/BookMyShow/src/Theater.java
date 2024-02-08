package LLD_JAVA.BookMyShow.src;

import java.util.ArrayList;
import java.util.List;

class Theater {
    private String name;
    private String location;
    private List<Movie> movies;

    public Theater(String name, String location) {
        this.name = name;
        this.location = location;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}