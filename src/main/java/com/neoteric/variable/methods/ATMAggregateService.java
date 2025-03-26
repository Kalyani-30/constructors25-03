package com.neoteric.variable.methods;

public class ATMAggregateService {


    public  Amount balance(Card inputCard, Pin inputPin){
        ATMService atmService=new ATMService();


        return atmService.getBalancelatest(inputCard,inputPin);
    }
}
