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
    static final String BASE_URL = "https://api.themoviedb.org/3/movie";
    static final String API_KEY = "?api_key=be2a38521a7859c95e2d73c48786e4bb";
    static final String NOW_PLAYING_URL = BASE_URL + "/now_playing" + API_KEY;
    static final String POP_API_URL = BASE_URL + "/popular" + API_KEY;
    static final String UP_API_URL = BASE_URL + "/upcoming" + API_KEY;

    List<Movie> movies = new ArrayList<>();

    @GetMapping("/apitest")
    public List<Movie> apiTest(){
        return generateMovies();
    }

    private List<Movie> generateMovies() {
        Movie movie1 = new Movie();
        movie1.setOverview("my overview");
        movie1.setPopularity(99.0);
        movie1.setPosterPath("https://yt3.ggpht.com/-Yai9Hqhjdl8/AAAAAAAAAAI/AAAAAAAAAAA/DdqlORbBBPQ/s900-c-k-no-mo-rj-c0xffffff/photo.jpg");
        movie1.setTitle("my apiTest Title");
        movies.add(movie1);
        return movies;
    }

    @CrossOrigin("http://unrentforest.surge.sh/")
    @GetMapping(path = "/api/now-playing")
    public ResponseEntity<List<Movie>> getMovies(@RequestParam String apikey) {
        if (! apikey.equalsIgnoreCase("abc")) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(NOW_PLAYING_URL, ResultsPage.class);

        return new ResponseEntity(resultsPage, HttpStatus.OK);
    }

    @CrossOrigin("http://unrentforest.surge.sh/")
    @GetMapping(path = "/api/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable(value = "id") String id, String apikey) {
        if (! apikey.equalsIgnoreCase("abc")) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
//        int newID = Integer.parseInt(id);
        RestTemplate restTemplate = new RestTemplate();
        Movie movie = restTemplate.getForObject(BASE_URL + id + API_KEY, Movie.class);
        return new ResponseEntity(movie, HttpStatus.OK);

    }

    @CrossOrigin("http://unrentforest.surge.sh/")
    @GetMapping(path = "/api/upcoming")
    public ResponseEntity<List<Movie>> upComingMovies(String apikey) {
        if (! apikey.equalsIgnoreCase("abc")) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(UP_API_URL, ResultsPage.class);
        return new ResponseEntity(resultsPage, HttpStatus.OK);
    }

    @CrossOrigin("http://unrentforest.surge.sh/")
    @GetMapping(path = "/api/popular")
    public ResponseEntity<List<Movie>> popularMovies(String apikey) {
        if (! apikey.equalsIgnoreCase("abc")) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        RestTemplate restTemplate = new RestTemplate();
        ResultsPage resultsPage = restTemplate.getForObject(POP_API_URL, ResultsPage.class);

        return new ResponseEntity(resultsPage, HttpStatus.OK);
    }


}

