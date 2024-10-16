import java.util.ArrayList;
import java.util.List;

public public class User {
    private String username;
    private String password;
    private String email;
    private List<Playlist> playlists;
    private List<Song> recentlyPlayed;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.playlists = new ArrayList<>();
        this.recentlyPlayed = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public List<Song> getRecentlyPlayed() {
        return recentlyPlayed;
    }

    public void setRecentlyPlayed(List<Song> recentlyPlayed) {
        this.recentlyPlayed = recentlyPlayed;
    }

    // Getters, Setters, and other helper methods
}
