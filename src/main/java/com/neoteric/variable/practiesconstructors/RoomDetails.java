package com.neoteric.variable.practiesconstructors;

public class RoomDetails {

    public String roomNumber;

    public double price;

    public RoomDetails(String roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomDetails{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
