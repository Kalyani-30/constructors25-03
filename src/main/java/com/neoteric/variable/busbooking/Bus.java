package com.neoteric.variable.busbooking;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    public String Number;
    public String  fromLocation;
    public String toLocation;
    public String serviceNumber;
    List<BusSeats> seats;


    public Bus() {
        this.seats = new ArrayList<>();
    }

    public void initializeSeats(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new BusSeats(i));
        }
    }

    public List<BusSeats> getAvailableSeats() {
        List<BusSeats> availableSeats = new ArrayList<>();
        for (BusSeats seat : seats) {
            if (!seat.isBooked()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Number='" + Number + '\'' +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", serviceNumber='" + serviceNumber + '\'' +
                ", seats=" + seats +
                '}';
    }
}
