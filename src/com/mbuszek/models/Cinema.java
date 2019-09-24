package com.mbuszek.models;

import com.mbuszek.enums.City;
import com.mbuszek.enums.Movies;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cinema {

    private City city;
    private List<Seans> seansList = new ArrayList<>();

    public Cinema(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public Cinema setCity(City city) {
        this.city = city;
        return this;
    }

    public List<Seans> getSeansList() {
        return seansList;
    }

    public Cinema setSeansList(List<Seans> seansList) {
        this.seansList = seansList;
        return this;
    }

    public Seans addSeans(Movies movie, LocalDateTime startTime, int capacity) {
        Seans seans = new Seans(movie, startTime, capacity);
        seansList.add(seans);
        return seans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return city == cinema.city &&
                Objects.equals(seansList, cinema.seansList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, seansList);
    }

    @Override
    public String toString() {
        return "Cinema{" + "city = " + city + ", seansList = " + seansList + '}';
    }
}
