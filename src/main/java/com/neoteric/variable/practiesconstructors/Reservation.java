package com.neoteric.variable.practiesconstructors;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Reservation {
    public String guestName;
    public int reservationId;
    public Date chechInDate;
    public Date checkOutDate;
    RoomDetails roomDetails;

    Map<String,RoomDetails> roomdata=new HashMap<>();

 public Reservation( String guestName,int reservationId,Date chechInDate,Date checkOutDate,RoomDetails roomDetails){
     this.guestName="kallu";
     this.reservationId=123;
     this.chechInDate=chechInDate;
     this.checkOutDate=checkOutDate;
     this.roomDetails=roomDetails;
     roomdata.put("kallu",roomDetails);


 }

    @Override
    public String toString() {
        return "Reservation{" +
                "guestName='" + guestName + '\'' +
                ", reservationId=" + reservationId +
                ", chechInDate=" + chechInDate +
                ", checkOutDate=" + checkOutDate +
                ", roomDetails=" + roomDetails +
                '}';
    }
}
