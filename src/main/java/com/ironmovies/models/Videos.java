package com.ironmovies.models;

import java.util.ArrayList;
import java.util.List;

public class Videos {

    public String id;
    public String key;
    public String name;
    public String site;
    public int size;
    public String type;

    List<Object> videoInfo = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(List<Object> videoInfo) {
        this.videoInfo = videoInfo;
    }
}
