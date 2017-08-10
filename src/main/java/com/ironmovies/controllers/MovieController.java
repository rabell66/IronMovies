package com.ironmovies.controllers;

import com.ironmovies.models.Movie;
import com.ironmovies.models.ResultsPage;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class MovieController {
    static final String API_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=be2a38521a7859c95e2d73c48786e4bb";
    static final String POP_API_URL = "https://api.themoviedb.org/3/movie/popular?api_key=be2a38521a7859c95e2d73c48786e4bb";
    static final String UP_API_URL = "https://api.themoviedb.org/3/movie/upcoming?api_key=be2a38521a7859c95e2d73c48786e4bb";

    @GetMapping(path = "/api/test")
    public ResponseEntity<List<Movie>> singleMovieTest() {
        RestTemplate testTemplate = new RestTemplate();
        ResultsPage resultsPage = testTemplate.getForObject(API_URL, ResultsPage.class);
        List<Movie> movies = resultsPage.getResults().stream()
                .filter(e -> e.getTitle()
                        .contains("Spider-Man: Homecoming"))
                .collect(Collectors.toList());
        return new ResponseEntity(movies, HttpStatus.OK);
    }

    @GetMapping(path = "/api/movies")
    public Object getMovies() {
        //TODO: checkfor api key ="abc"
        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(API_URL, ResultsPage.class);
        return resultsPage;
    }

    @GetMapping(path = "/api/movies/{id}")

    public @ResponseBody
    List<Movie> getAttr(@PathVariable(value = "id") String id, String someAttr) {
        int newID = Integer.parseInt(id);
        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(API_URL, ResultsPage.class);
        return resultsPage.getResults().stream().filter(e -> e.getId() == newID).collect(Collectors.toList());

    }

    @GetMapping(path = "/api/upcoming")
    public Object upComingMovies() {
        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(UP_API_URL, ResultsPage.class);
        return resultsPage;
    }


    @GetMapping(path = "/api/popular")
    public Object popularMovies() {
        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(POP_API_URL, ResultsPage.class);
        return resultsPage.getResults().stream().filter(e -> e.getPopularity() > 50).collect(Collectors.toList());
    }


}

