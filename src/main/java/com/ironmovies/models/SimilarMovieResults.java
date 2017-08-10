package com.ironmovies.models;

import java.util.List;

public class SimilarMovieResults {
    List<SimilarMovie> results;

    public SimilarMovieResults() {
    }

    public List<SimilarMovie> getResults() {
        return results;
    }

    public void setResults(List<SimilarMovie> results) {
        this.results = results;
    }
}
