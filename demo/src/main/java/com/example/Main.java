package com.example;

public class Main {
    public static void main(String[] args) {
        RecommendationSystem recommendationSystem = new RecommendationSystem();
        // Supongamos que el usuario ha visto un video con ID "video123"
        String videoId = "video123";
        recommendationSystem.getRecommendations(videoId);
    }
}