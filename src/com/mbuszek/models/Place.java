package com.mbuszek.models;

import com.mbuszek.models.enums.PlaceStatus;

public class Place {

    private int placeID;
    private Ticket ticket;
    private PlaceStatus placeStatus = PlaceStatus.FREE;

    Place(int placeID, Ticket ticket, PlaceStatus placeStatus) {
        this.placeID = placeID;
        this.ticket = ticket;
        this.placeStatus = placeStatus;
    }

    int getPlaceID() {
        return placeID;
    }

    public Place setPlaceID(int placeID) {
        this.placeID = placeID;
        return this;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public PlaceStatus getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(PlaceStatus placeStatus) {
        this.placeStatus = placeStatus;
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
