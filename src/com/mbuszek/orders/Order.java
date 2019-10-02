package com.mbuszek.orders;

import com.mbuszek.models.enums.Movies;
import com.mbuszek.models.enums.PlaceStatus;
import com.mbuszek.models.enums.TicketStatus;
import com.mbuszek.models.Cinemas;
import com.mbuszek.models.Place;
import com.mbuszek.models.Screening;
import com.mbuszek.models.Ticket;

public class Order {

    private Cinemas cinemaSystem;

    public Order(Cinemas cinemaSystem) {
        this.cinemaSystem = cinemaSystem;
    }

    public void buyTicket(Screening screening, boolean normalPrice, int placeId) {

        Place place = screening.findPlace(placeId);
        if (place == null || place.getPlaceStatus() != PlaceStatus.FREE) {

            System.out.println("Place already taken");
        }
        double price = 0;

        TicketStatus ticketStatus = TicketStatus.WAITINGFORPAYMENT;

        if (normalPrice) {
            price = 30;
        } else {
            price = 15;
        }

        Ticket ticket = new Ticket(price, normalPrice, place, Movies.MATRIX, TicketStatus.WAITINGFORPAYMENT);

        place.setPlaceStatus(PlaceStatus.RESERVED);
        place.setTicket(ticket);

        System.out.println(ticket);

    }

    public void orderConfirmation(Screening screening, int placeId) {
        Place place = screening.findPlace(placeId);
        place.setPlaceStatus(PlaceStatus.OCCUPIED);
        Ticket ticket = place.getTicket();
        ticket.setTicketStatus(TicketStatus.FULLYCONFIRMED);
    }

    public void orderCancel(Screening screening, int placeId) {
        Place place = screening.findPlace(placeId);
        place.setPlaceStatus(PlaceStatus.FREE);
        Ticket ticket = place.getTicket();
        ticket.setTicketStatus(TicketStatus.CANCELED);
    }
}
