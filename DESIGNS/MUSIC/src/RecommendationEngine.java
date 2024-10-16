import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecommendationEngine {
    private List<Song> allSongs;

    public RecommendationEngine(List<Song> allSongs) {
        this.allSongs = allSongs;
    }

    // Basic recommendation algorithm: returns random songs from the available list
    public List<Song> recommendSongs(User user) {
        List<Song> recommendations = new ArrayList<>();
        Random random = new Random();

        // Assuming the recommendation engine recommends 5 songs
        for (int i = 0; i < 5; i++) {
            recommendations.add(allSongs.get(random.nextInt(allSongs.size())));
        }

        return recommendations;
    }
}
