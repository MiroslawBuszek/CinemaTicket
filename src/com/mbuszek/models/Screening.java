package com.mbuszek.models;

import com.mbuszek.enums.Movies;
import com.mbuszek.enums.PlaceStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Screening {

    private Movies movie;
    private LocalDateTime startTime;
    private List<Place> placesList = new ArrayList<>();

    Screening(Movies movie, LocalDateTime startTime, int capacity) {
        this.movie = movie;
        this.startTime = startTime;
        addPlaces(capacity);
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

    private void addPlaces(int capacity) {
        for (int i = 0; i < capacity; i++) {
            Place place = new Place(i, null, PlaceStatus.FREE);
            placesList.add(place);
        }
    }

    public Place findPlace(int placeId) {
        for (Place place : placesList) {
            if (place.getPlaceID() == placeId) {
                return place;
            }
        }

        return null;
    }

    public List<Place> getPlacesList() {
        return placesList;
    }

    @Override
    public String toString() {
        return "Screening{" + "movie = " + movie + ", startTime=" + startTime + ", placesList = " + placesList + '}';
    }
}
