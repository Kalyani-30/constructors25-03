package com.neoteric.variable.methods;

public class Test {

   public static void main(String[] args) {
      System.out.println(Thread.currentThread().getName());
      DBService dbService=new DBService();
      Card inputCard = new Card();
      inputCard.cardNumber = "1111";
      Pin inputPin = new Pin();
      inputPin.pinNumber = "123";
      inputPin.cardNumber = "1111";

      Amount amount=new Amount();
      amount.amount=2345.0;

      dbService.carddata.put(inputCard.cardNumber, inputCard);
      dbService.pindata.put(inputCard.cardNumber, inputPin);
      dbService.balancedata.put(inputCard.cardNumber, amount);
      dbService.balancedata.put(inputCard.cardNumber, amount);

      ATMAggregateService atmAggregateService = new ATMAggregateService();
//      atmAggregateService.balance(inputCard, inputPin);
      Amount balance = atmAggregateService.balance(inputCard, inputPin);
      if (balance!= null) {
         System.out.println("Your available balance is: " + balance.amount);
      } else {
         System.out.println("Error: Could not retrieve balance.");
      }
   }

   }

