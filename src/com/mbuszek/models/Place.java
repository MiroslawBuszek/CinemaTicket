package com.mbuszek.models;

import com.mbuszek.enums.PlaceStatus;

public class Place {

    private int placeID;
    private Ticket ticket;
    private PlaceStatus placeStatus = PlaceStatus.FREE;

    public Place(int placeID, Ticket ticket, PlaceStatus placeStatus) {
        this.placeID = placeID;
        this.ticket = ticket;
        this.placeStatus = placeStatus;
    }

    public int getPlaceID() {
        return placeID;
    }

    public Place setPlaceID(int placeID) {
        this.placeID = placeID;
        return this;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Place setTicket(Ticket ticket) {
        this.ticket = ticket;
        return this;
    }

    public PlaceStatus getPlaceStatus() {
        return placeStatus;
    }

    public Place setPlaceStatus(PlaceStatus placeStatus) {
        this.placeStatus = placeStatus;
        return this;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeID=" + placeID +
                ", ticket=" + ticket +
                ", placeStatus=" + placeStatus +
                '}';
    }
}
