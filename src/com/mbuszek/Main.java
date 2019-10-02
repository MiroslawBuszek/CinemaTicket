package com.mbuszek;

import com.mbuszek.models.enums.City;
import com.mbuszek.models.enums.Movies;
import com.mbuszek.orders.Order;
import com.mbuszek.models.Cinema;
import com.mbuszek.models.Cinemas;
import com.mbuszek.models.Screening;
import com.mbuszek.utils.UserActivities;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Cinemas cinemaSystem = new Cinemas();

        Cinema warsaw = cinemaSystem.addCinema(City.WARSZAWA);
        Screening screening = warsaw.addScreening(Movies.MATRIX, LocalDateTime.of(2019, 10, 12, 15, 30), 10);

        Order order = new Order(cinemaSystem);
        order.buyTicket(screening, false, 0);
        order.buyTicket(screening, true, 1);
        order.buyTicket(screening, false, 4);

        System.out.println();

        System.out.println(screening);

        System.out.println();

        order.orderCancel(screening, 0);
        order.orderConfirmation(screening, 1);
        System.out.println();
        System.out.println(screening);
        System.out.println();
        UserActivities userAct = new UserActivities();
        userAct.userActivities();

    }
}
