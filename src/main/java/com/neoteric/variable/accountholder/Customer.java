package com.neoteric.variable.accountholder;

import com.neoteric.variable.Address;

public class Customer {

     private String name;
     private String mobileNumber;
     private String adhar;
     private String pan;
     Balance balance;

      Address address;

    public Customer( String name, String mobileNumber, String adhar, String pan, Address address,Balance balance) {

        this.name = name;
        this.mobileNumber = mobileNumber;
        this.adhar = adhar;
        this.pan = pan;
        this.address = address;
        this.balance=balance;
    }



    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAdhar() {
        return adhar;
    }

    public String getPan() {
        return pan;
    }

    public Address getAddress() {
        return address;
    }

    public Balance getBalance() {
        return balance;
    }
}

