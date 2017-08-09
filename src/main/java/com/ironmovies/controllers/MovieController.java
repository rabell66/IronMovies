package com.ironmovies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class MovieController {
        static final String API_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=be2a38521a7859c95e2d73c48786e4bb";

        @GetMapping(path = "/")
        public String login() {
            return "This is a restful API Goto /API/routes";
        }


//        @RequestMapping(path = "/mepdium-popular-long-name", method = RequestMethod.GET)
//        public String medPop(){
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

