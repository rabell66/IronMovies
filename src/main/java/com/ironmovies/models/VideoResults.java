package com.ironmovies.models;

import java.util.ArrayList;
import java.util.List;

public class VideoResults {
    List<Video> results = new ArrayList<>();

    public VideoResults() {
    }

    public List<Video> getResults() {
        return results;
    }

    public void setResults(List<Video> results) {
        this.results = results;
    }
}
