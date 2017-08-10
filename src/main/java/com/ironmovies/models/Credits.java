package com.ironmovies.models;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

public class Credits extends Movie {

    List<Object> castList = new ArrayList<>();

        public String character;
        public String castName;



    List<Object> crewList = new ArrayList<>();
        public String crewName;
        public String job;


    public List<Object> getCastList() {
        return castList;
    }

    public void setCastList(List<Object> castList) {
        this.castList = castList;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public List<Object> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<Object> crewList) {
        this.crewList = crewList;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
