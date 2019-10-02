package com.mbuszek.models;

import com.mbuszek.models.enums.City;
import com.mbuszek.models.enums.Movies;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cinema {

    private City city;
    private List<Screening> screeningList = new ArrayList<>();

    Cinema(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public Cinema setCity(City city) {
        this.city = city;
        return this;
    }

    public List<Screening> getScreeningList() {
        return screeningList;
    }

    public Cinema setScreeningList(List<Screening> screeningList) {
        this.screeningList = screeningList;
        return this;
    }

    public Screening addScreening(Movies movie, LocalDateTime startTime, int capacity) {
        Screening screening = new Screening(movie, startTime, capacity);
        screeningList.add(screening);
        return screening;
    }

    @Override
    public String toString() {
        return "Cinema{" + "city = " + city + ", screeningList = " + screeningList + '}';
    }
}
