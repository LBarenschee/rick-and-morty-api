package com.example.rickandmortyapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest
class RickAndMortyApiApplicationTests {
    @LocalServerPort
    private int port;

    @Autowired



    @Test
    void contextLoads() {
    }

}
