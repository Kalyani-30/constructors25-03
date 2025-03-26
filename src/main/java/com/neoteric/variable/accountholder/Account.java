package com.neoteric.variable.accountholder;

import com.neoteric.variable.Address;

public class Account {
   private String accountNumber;
   private String customerName;
    private String mobileNumber;
   private String adhar;
   private String pan;

    Address address;
    Balance balance;
    Nomine nomine;

    public Account(String accountNumber, String custoerName, String modileNumber, String adhar, String pan, Address address,Balance balance) {
        this.accountNumber = accountNumber;
        this.customerName = custoerName;
        this.mobileNumber = modileNumber;
        this.adhar = adhar;
        this.pan = pan;
        this.address = address;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
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
