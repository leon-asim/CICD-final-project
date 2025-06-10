package com.example.backend.service;

import com.example.backend.entity.VideoGame;

import java.util.List;

public interface VideoGameService {
    List<VideoGame> getVideoGames();
    VideoGame addVideoGame(VideoGame videoGame);
}
