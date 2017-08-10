package com.ironmovies.controllers;

import com.ironmovies.models.ResultsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MovieControllerTests {

    @LocalServerPort
    private int port;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void singleMovieTest() throws Exception {
        String TEST_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=be2a38521a7859c95e2d73c48786e4bb";
        ResponseEntity<ResultsPage> entity = this.restTemplate.exchange(
                RequestEntity.get(uri("/api/fail-cors")).header(HttpHeaders.ORIGIN, "http://localhost:" + port).build(),
                ResultsPage.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(TEST_URL, entity.getHeaders().getAccessControlAllowOrigin());
        ResultsPage movie = entity.getBody();
        assertEquals("Spider-Man: Homecoming", movie.getResults());
    }

    @Test
    public void getMovies() throws Exception {
    }

    private URI uri(String path) {
        return restTemplate.getRestTemplate().getUriTemplateHandler().expand(path);
    }

//    "https://developers.themoviedb.org/3/movies/get-top-rated-movies"

}