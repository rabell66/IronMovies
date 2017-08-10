package com.ironmovies.models;

public class Video{

    private String key;
    public static final String YOUTUBE = "https://www.youtube.com/watch?v=";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    public String generateUrl() {
        return YOUTUBE + getKey();
    }
}
