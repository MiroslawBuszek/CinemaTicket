package com.mbuszek.models;

import com.mbuszek.models.enums.Movies;
import com.mbuszek.models.enums.TicketStatus;

import java.util.Objects;

public class Ticket {

    private double price;
    private boolean normalPrice;
    private Place place;
    private Movies movie;

    private TicketStatus ticketStatus;

    public Ticket(double price, boolean normalPrice, Place place, Movies movie, TicketStatus ticketStatus) {
        this.price = price;
        this.normalPrice = normalPrice;
        this.place = place;
        this.movie = movie;

        this.ticketStatus = ticketStatus;
    }

    public double getPrice() {
        return price;
    }

    public Ticket setPrice(double price) {
        this.price = price;
        return this;
    }

    public boolean isNormalPrice() {
        return normalPrice;
    }

    public Ticket setNormalPrice(boolean normalPrice) {
        this.normalPrice = normalPrice;
        return this;
    }

    public Place getPlace() {
        return place;
    }

    public Ticket setPlace(Place place) {
        this.place = place;
        return this;
    }

    public Movies getMovie() {
        return movie;
    }

    public Ticket setMovie(Movies movie) {
        this.movie = movie;
        return this;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price = " + price +
                ", normalPrice = " + normalPrice +
                ", movie = " + movie +
                ", ticketStatus = " + ticketStatus +
                '}';
    }
}
