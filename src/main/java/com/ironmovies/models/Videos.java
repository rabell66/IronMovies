package com.ironmovies.models;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

public class Videos extends Movie {

    List<Object> resultsList = new ArrayList<>();

    public String key;
    public String youtube = "https://www.youtube.com/watch?v=";

    public List<Object> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<Object> resultsList) {
        this.resultsList = resultsList;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
}
