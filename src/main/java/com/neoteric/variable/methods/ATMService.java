package com.neoteric.variable.methods;

import java.util.Map;

public class ATMService {


    public  Amount getBalance (Card card,Pin pin){
        DBService dbService=new DBService();
        if(insertcard(card)){
            if(enterPin(pin)){
                Map<String,Amount> balanceMap= dbService.balancedata;

                return  balanceMap.get(card.cardNumber);
            }else {
                return null;
            }
        }else {
            return null;
        }

    }
    public Amount getBalancelatest(Card card,Pin pin){
        Amount amount = null;
        DBService dbService=new DBService();
        if(insertcard(card)){
            if(enterPin(pin)){
                Map<String,Amount> balanceMap= dbService.balancedata;
            }
        }
        return amount;
    }

    boolean insertcard(Card card) {
        DBService dbService = new DBService();


        Map<String, Card> cardDB = dbService.carddata;

        if(cardDB.containsKey(card.cardNumber)){
            return true;
        }else {
            return false;
        }
    }

    boolean insertCardTest(Card card){

        boolean isInvalidCard = false;
        DBService dbService= new DBService();
        Map<String,Card> cardDB = dbService.carddata;
        if(cardDB.containsKey(card.cardNumber)){
            isInvalidCard= true;
        }else {

        }
        return false;
    }

    boolean enterPin(Pin vpin){
        DBService dbService=new DBService();

        Map<String,Pin> pinCardDB =dbService.pindata;

        Pin dbpin= dbService.pindata.get(vpin.cardNumber);
//        Pin dbPin = dbService.pindata.get(vpin.cardNumber);


        if (dbpin == null) {
            System.out.println(" PIN not found for this card.");
            return false;
        }

        int enteredPin = Integer.parseInt(vpin.pinNumber);
        int storedPin = Integer.parseInt(dbpin.pinNumber);

        if (enteredPin == storedPin) {

            return true;
        } else {

            return false;
        }
    }
    boolean withdraw(Amount inputAmount, Pin pin){
        DBService dbService =new DBService();
      Map<String,Amount>balanceMap=dbService.balancedata;
      Amount availableBalance= balanceMap.get(pin.cardNumber);
        if (availableBalance.amount > inputAmount.amount) {
            double totalBalance = availableBalance.amount - inputAmount.amount;
            availableBalance.amount = totalBalance;
          return true;
      }


         else {
            System.out.println("Insufficient balance.");
            return false;
        }

    }


    public  void checkBalance(Card card,Pin pin){
        DBService dbService=new DBService();
        if(insertcard(card)){
            System.out.println("invalid card");
            return;
        }
            if(enterPin(pin)){
                System.out.println("invalid pin");
                return;

            }

        Map<String, Amount> balanceMap = dbService.balancedata;
        Amount availableBalance = balanceMap.get(card.cardNumber);

        if (availableBalance != null) {
            System.out.println("Your available balance is: " + availableBalance.amount);
        } else {
            System.out.println("Error: Balance data not found for this card.");
        }

    }

}




