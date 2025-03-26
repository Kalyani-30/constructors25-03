package com.neoteric.variable.methods;

import java.util.HashMap;
import java.util.Map;


public class DBService {

    Map<String, Card> carddata = new HashMap<>();
    Map<String, Pin> pindata = new HashMap<>();
    Map<String, Amount> balancedata = new HashMap<>();

   public DBService(){
       populate();
       populatePinData();
       populateBalancedata();
   }




    public void populate() {

        Card card111 = new Card();
        card111.name = "rty";
        card111.cardNumber="1111";
        card111.fromDate = "14-03-25";
        card111.toDate = "14-03-26";
        carddata.put(card111.cardNumber, card111);


    }
        public void populatePinData() {

            Pin pin111 = new Pin();
            pin111.pinNumber = "123";
            pin111.cardNumber = "1111";
            pindata.put(pin111.cardNumber, pin111);

        }
        public void populateBalancedata(){
       Amount amount= new Amount();
       amount.amount=123.0;
       amount.currency="INR";
       balancedata.put("1111",amount);

        }
    }






