package com.mbuszek.models;

import com.mbuszek.enums.City;
import com.mbuszek.enums.Movies;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return city == cinema.city &&
                Objects.equals(screeningList, cinema.screeningList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, screeningList);
    }

    @Override
    public String toString() {
        return "Cinema{" + "city = " + city + ", screeningList = " + screeningList + '}';
    }
}
