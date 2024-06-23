package com.cydeo.controller;

import com.cydeo.dto.MovieCinemaDTO;
import com.cydeo.service.GenreService;
import com.cydeo.service.MovieCinemaService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
public class Consume_WebClient {

    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();

    private final MovieCinemaService movieCinemaService;
    private final GenreService genreService;

    public Consume_WebClient(MovieCinemaService movieCinemaService, GenreService genreService) {
        this.movieCinemaService = movieCinemaService;
        this.genreService = genreService;
    }


    public Flux<MovieCinemaDTO> readAllCinemaFlux(){
        return Flux.fromIterable(movieCinemaService.findAll());
    }

}
