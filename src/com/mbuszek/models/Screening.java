package com.mbuszek.models;

import com.mbuszek.enums.Movies;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Screening {

    private Movies movie;
    private LocalDateTime startTime;
    private List<Place> placesList = new ArrayList<>();

    public Screening(Movies movie, LocalDateTime startTime, int capacity) {
        this.movie = movie;
        this.startTime = startTime;
    }

    public Movies getMovie() {
        return movie;
    }

    public Screening setMovie(Movies movie) {
        this.movie = movie;
        return this;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Screening setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public List<Place> getPlaces() {
        return placesList;
    }

    public Screening setPlaces(List<Place> places) {
        this.placesList = places;
        return this;
    }


    public List<Place> getPlacesList() {
        return placesList;
    }

    @Override
    public String toString() {
        return "Screening{" + "movie = " + movie + ", startTime=" + startTime + ", placesList = " + placesList + '}';
    }
}
