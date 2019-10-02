package com.mbuszek.models;

import com.mbuszek.models.enums.City;

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
    public String toString() {
        return "Cinemas{" +
                "cinemasList = " + cinemasList +
                '}';
    }
}
