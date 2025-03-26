package com.neoteric.variable.busbooking;

public class BusSeats {
    public int seatNumber;
    public boolean isBooked;

    public BusSeats(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }
    public boolean isBooked() {
        return isBooked;
    }
    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "BusSeats{" +
                "seatNumber=" + seatNumber +
                ", isBooked=" + isBooked +
                '}';
    }
}
