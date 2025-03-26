package com.neoteric.variable.practiesconstructors;

import javax.xml.crypto.Data;
import java.util.Date;

public class BookingRoomTest {

    public static void main(String[] args) {

        Date checkIn = new Date();
        Date checkOut =new Date();
        RoomDetails roomDetails=new RoomDetails("12345",4000.0);
        Reservation reservation=new Reservation("kallu",123,checkIn,checkOut,roomDetails );

        System.out.println(reservation);


       String sql= "select name from reservation ";

    }

}
