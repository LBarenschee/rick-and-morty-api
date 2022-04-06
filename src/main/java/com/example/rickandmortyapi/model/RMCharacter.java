package com.example.rickandmortyapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RMCharacter {

    private Integer id;
    private String name;
    private String status;

}
