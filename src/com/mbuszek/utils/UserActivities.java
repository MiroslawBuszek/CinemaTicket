package com.mbuszek.utils;

import java.util.Scanner;

public class UserActivities {

    public static void userActivities() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("'1' > book a ticket");
        System.out.println("'2' > confirm payment");
        System.out.println("'3 > cancel payment");
        String typeOfProcess = scanner.next();

        if (typeOfProcess.equals("1")) {
            System.out.println("Select a screening");
            String screening = scanner.next();
            System.out.println("Select a place ID");
            int id = scanner.nextInt();
        }
    }
}
