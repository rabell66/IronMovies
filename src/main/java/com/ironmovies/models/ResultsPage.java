package com.ironmovies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ironmovies.models.Movie;

import java.util.List;

@JsonIgnoreProperties
public class ResultsPage {
    private List<Movie> results;


    public List<AlternativeTitle> alternativeTitles;

    public ResultsPage() {
    }


    public List<AlternativeTitle> getAlternativeTitles() {
        return alternativeTitles;
    }

    public void setAlternativeTitles(List<AlternativeTitle> alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }


}
