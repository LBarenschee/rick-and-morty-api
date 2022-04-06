package com.example.rickandmortyapi.service;

import com.example.rickandmortyapi.api.RmApiService;
import com.example.rickandmortyapi.model.RMCharacter;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RickAndMortyService {

    private final RmApiService rmApiService;

    @Autowired
    public RickAndMortyService(RmApiService rmApiService) {
        this.rmApiService = rmApiService;
    }



    public List<RMCharacter> retrieveRmCharacters() {
        return rmApiService.retrieveRmCharacters();
    }
}

