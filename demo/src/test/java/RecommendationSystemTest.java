import com.example.RecommendationSystem;

public class RecommendationSystemTest {

    @Test
    public void testGetRecommendations() {
        RecommendationSystem recommendationSystem = new RecommendationSystem();

        // Prueba para un video existente en el sistema
        String videoId = "video123";
        String[] expectedRecommendations = {"Título del Video 1", "Título del Video 2", "Título del Video 3"};
        assertArrayEquals(expectedRecommendations, recommendationSystem.getRecommendations(videoId));
        
        // Prueba para un video inexistente en el sistema
        videoId = "video999";
        assertNull(recommendationSystem.getRecommendations(videoId));
    }
}
