package com.mbuszek.models;

import com.mbuszek.enums.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cinemas {

    private List<Cinema> cinemasList = new ArrayList<>();

    public Cinema addCinema(City city) {
        Cinema cinema = new Cinema(city);
        cinemasList.add(cinema);
        return cinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinemas cinemas = (Cinemas) o;
        return Objects.equals(cinemasList, cinemas.cinemasList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemasList);
    }

    @Override
    public String toString() {
        return "Cinemas{" +
                "cinemasList = " + cinemasList +
                '}';
    }
}
