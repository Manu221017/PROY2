package com.example;

import java.util.ArrayList;
import java.util.List;

public class RecommendationSystem {
    private List<Video> videos;

    public RecommendationSystem() {
        // Supongamos que inicialmente tenemos algunos videos en nuestro sistema
        this.videos = new ArrayList<>();
        videos.add(new Video("video123", "Título del Video 1"));
        // Agregar más videos según sea necesario
    }

    public void getRecommendations(String videoId) {
        
        System.out.println("Recomendaciones para el video con ID: " + videoId);
        for (int i = 0; i < 3; i++) {
            System.out.println("Video Recomendado " + (i + 1) + ": " + videos.get(i).getTitle());
        }
    }
}
