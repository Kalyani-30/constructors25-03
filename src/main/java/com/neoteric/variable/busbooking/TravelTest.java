package com.neoteric.variable.busbooking;

import java.util.List;

public class TravelTest {
    public static void main(String[] args) {


        TravelDBService travelDBService = new TravelDBService();


        String from = "HYD";
        String to = "KMM";

        List<Bus> availableBuses = travelDBService.findBuses(from, to);

        if (availableBuses.isEmpty()) {
            System.out.println("No buses available from " + from + " to " + to);

        } else {
            System.out.println("Available buses from " + from + " to " + to + ":");
            for (Bus bus : availableBuses) {
                System.out.println(bus);
            }
        }
    }

    public static void AvailableSeats(TravelDBService travelDBService, String busNumber) {
        List<BusSeats> availableSeats = travelDBService.getAvailableSeats(busNumber);
        if (availableSeats.isEmpty()) {
            System.out.println("No available seats for Bus Number: " + busNumber);
        } else {
            System.out.print("Available seats for Bus Number " + busNumber + ": ");
            for (BusSeats seat : availableSeats) {
                System.out.print(seat.getSeatNumber() + " ");
            }
            System.out.println(); // Move to a new line
        }
    }
}


