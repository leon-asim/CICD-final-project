package com.example.backend.service;

import com.example.backend.entity.VideoGame;
import com.example.backend.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameServiceImpl implements VideoGameService{

    @Autowired
    private VideoGameRepository videoGameRepository;

    @Override
    public List<VideoGame> getVideoGames() {
        return videoGameRepository.findAll();
    }

    @Override
    public VideoGame addVideoGame(VideoGame videoGame) {
        return videoGameRepository.save(videoGame);
    }
}
