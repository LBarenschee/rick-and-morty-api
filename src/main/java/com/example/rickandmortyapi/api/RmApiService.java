package com.example.rickandmortyapi.api;

import com.example.rickandmortyapi.model.RMCharacter;
import com.example.rickandmortyapi.model.RMCharacterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.List;

@Service
public class RmApiService {

    private final WebClient webClient;

    @Autowired
    public RmApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<RMCharacter> retrieveRmCharacters() {
        //API Call
        RMCharacterInfo characterInfo = webClient
                .get()
                .uri("/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(RMCharacterInfo.class)
                .block()
                .getBody();

        return characterInfo.getResults();
    }
}
