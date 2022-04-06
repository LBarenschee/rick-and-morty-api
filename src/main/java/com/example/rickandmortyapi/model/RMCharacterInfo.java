package com.example.rickandmortyapi.model;

import lombok.Data;

import java.util.List;

@Data
public class RMCharacterInfo {

    private List<RMCharacter> results;
}
