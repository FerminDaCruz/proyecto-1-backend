package com.example.game_service_api.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {
    @PostMapping
    public ResponseEntity<Game> saveGame(@RequestBody Game game) {
        return ResponseEntity.ok(game);
    }
}