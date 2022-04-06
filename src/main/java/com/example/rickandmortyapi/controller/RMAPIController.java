package com.example.rickandmortyapi.controller;

import com.example.rickandmortyapi.model.RMCharacter;
import com.example.rickandmortyapi.api.RmApiService;
import com.example.rickandmortyapi.service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("character")
public class RMAPIController {

    private final RickAndMortyService rmService;

    @Autowired
    public RMAPIController(RickAndMortyService rmService) {
        this.rmService = rmService;
    }

    @GetMapping
    public List<RMCharacter> getAllCharacters() {
        return rmService.retrieveRmCharacters();
    }
}