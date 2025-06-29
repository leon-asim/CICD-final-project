package com.example.backend.controller;

import com.example.backend.entity.VideoGame;
import com.example.backend.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/videogame")
public class VideoGameController {

    @Autowired
    private VideoGameService videoGameService;

    @PostMapping
    public ResponseEntity<VideoGame> addGame(@RequestBody VideoGame videoGame) {
        VideoGame savedGame = videoGameService.addVideoGame(videoGame);
        return new ResponseEntity<>(savedGame, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<VideoGame>> getAllGames() {
        List<VideoGame> videoGamesList = videoGameService.getVideoGames();
        return ResponseEntity.ok(videoGamesList);
    }

}
