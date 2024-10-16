import java.util.ArrayList;
import java.util.List;

import Services.AuthService;

// Use a relational database (e.g., MySQL or PostgreSQL) or a NoSQL database (e.g., MongoDB) to store user data, playlists, and song information.
public class MusicApp {
    public static void main(String[] args) {
        // Authentication
        AuthService authService = new AuthService();
        authService.registerUser("john_doe", "password123", "john@example.com");

        User user = authService.loginUser("john_doe", "password123");
        if (user != null) {
            System.out.println("Login successful! Welcome " + user.getUsername());
        } else {
            System.out.println("Login failed. Please check your credentials.");
            return;
        }

        // Create some songs
        Song song1 = new Song("Song A", "Artist 1", "Album 1", "Pop", 240);
        Song song2 = new Song("Song B", "Artist 2", "Album 2", "Rock", 180);
        Song song3 = new Song("Song C", "Artist 1", "Album 1", "Pop", 200);

        // Create a playlist
        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        // Play songs and shuffle
        MusicPlayer musicPlayer = new MusicPlayer(playlist.getSongs());
        musicPlayer.play();

        System.out.println("\nShuffling playlist...\n");
        musicPlayer.shufflePlaylist();
        musicPlayer.play();

        // Recommendation engine
        List<Song> allSongs = new ArrayList<>();
        allSongs.add(song1);
        allSongs.add(song2);
        allSongs.add(song3);

        RecommendationEngine recommendationEngine = new RecommendationEngine(allSongs);
        List<Song> recommendations = recommendationEngine.recommendSongs(user);

        System.out.println("\nRecommended songs for you:");
        for (Song song : recommendations) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
