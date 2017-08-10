package com.ironmovies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class AlternativeTitleResults {

    private List<AlternativeTitle> titles;

    AlternativeTitleResults(){}

    public List<AlternativeTitle> getTitles() {
        return titles;
    }

    public void setTitles(List<AlternativeTitle> titles) {
        this.titles = titles;
    }
}
