package com.neoteric.variable.busbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelDBService {

Map<String,Bus> busdata=  new HashMap<>();
List<Bus> busList=new ArrayList<>();

//create constructor whenever you want a constructor name and class name must be a same
public TravelDBService(){
    populatebusdata();

}

public void   populatebusdata(){

    Bus bus = new Bus();
    bus.Number="1233";
    bus.fromLocation="hyd";
    bus.toLocation="kmm";
    bus.serviceNumber="11111";
    bus.initializeSeats(40);

    busdata.put("hyd-kmm",bus);

    Bus bus1 = new Bus();
    bus1.Number="12334";
    bus1.fromLocation="hyd";
    bus1.toLocation="kmm";
    bus1.serviceNumber="33333";
    bus1.initializeSeats(35);
    busdata.put("hyd-kmm",bus1);

    Bus bus2 =new Bus();
    bus2.serviceNumber="22222";
    bus2.Number="2345";
    bus2.fromLocation="Bcm";
    bus2.toLocation="kdd";
    bus2.initializeSeats(25);
    busdata.put("Bcm-kdd",bus2);

    busList.add(bus);
    busList.add(bus1);
    busList.add(bus2);
}

    public List<Bus> findBuses(String from, String to) {
        List<Bus> availableBuses = new ArrayList<>();

        for (Bus bus : busList) {
            if (bus.fromLocation.equalsIgnoreCase(from) && bus.toLocation.equalsIgnoreCase(to)) {
                availableBuses.add(bus);
            }
        }
        return availableBuses;
    }

    public List<BusSeats> getAvailableSeats(String busNumber) {
        for (Bus bus : busList) {
            if (bus.Number.equals(busNumber)) {
                return bus.getAvailableSeats();
            }
        }
        return new ArrayList<>();
    }


    }



