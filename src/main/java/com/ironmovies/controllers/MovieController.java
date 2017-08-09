package com.ironmovies.controllers;

import com.ironmovies.models.Movie;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MovieController {
    List<Movie> movies = new ArrayList();
    static final String API_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=be2a38521a7859c95e2d73c48786e4bb";

    @GetMapping(path = "/api/movies")
    public String getMovies(String route) {
        //TODO: checkfor api key ="abc"
//        RestTemplate restTemplate = new RestTemplate();
//        Results results = restTemplate.getForObject(route, Results.class);
//        return results.top(10);
        return "{\"movies\":[{\"posterPath\": \"https://www.filepicker.io/api/file/pNN5QACWR1m85rWSppYa\", " +
                "\"title\": \"This is my Title\", " +
                "\"overview\": \"here is the descriptive overview…\"}]}";
    }


//
//            model.addAttribute("movies",getMovies(API_URL)
//                    .stream()
//                    .filter(e->e.getTitle().length()>9)
//                    .filter(e->e.getPopularity()>29 && e.getPopularity()<81)
//                    .collect(Collectors.toList()));
//            return "medium-popular-long-name";
//        }
//        @GetMapping(path = "/now-playing")
//        public String nowPlaying (){
//            model.addAttribute("movies",getMovies(API_URL));
//            return "now-playing";
//        }
//
//        public List<Movie> getMovies(String route){
//            RestTemplate restTemplate = new RestTemplate();
//            ResultsPage results  = restTemplate.getForObject(route, ResultsPage.class);
//
//
//            return results.getResults();
//    }
}

