package com.neoteric.variable.accountholder;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AccountService {
//    public void amountStatus(Account account) {
//        int minBalance = 5000; // Minimum required balance
//
//        if (account.getBalance().getAmount() >= minBalance) {
//            System.out.println("Amount is available in Account");
////            System.out.println(" Account Number: " + account.getAccountNumber());
////            System.out.println(" Customer Name: " + account.getCustomerName());
////            System.out.println(" Mobile Number: " + account.getMobileNumber());
////            System.out.println(" Aadhar: " + account.getAdhar());
////            System.out.println(" PAN: " + account.getPan());
////            System.out.println(" Address: " + account.getAddress());
////            System.out.println(" Balance: ₹" + account.getBalance().getAmount());
//
//        }else {
//            System.out.println("minimum balance" + minBalance + " is ");
//        }
//    }




    Map<String,Account> accountdata= new HashMap<>();
    Map<String,Customer> customerdata = new HashMap<>();
    Map<String,Balance>  balanceData = new HashMap<>();
    private static final double MIN_BALANCE = 5000.0;



    public  Account populateaccount(Customer customer){

        String accountId= UUID.randomUUID().toString();

        Account account= new Account(accountId,customer.getName(),customer.getMobileNumber(),
                customer.getAdhar(),customer.getPan(),customer.address,customer.getBalance());
        accountdata.put(accountId,account);
        return account;

    }

    public Customer populateCustomer(Account account) {
        String customerId = UUID.randomUUID().toString();

        Customer customer = new Customer(account.getCustomerName(), account.getMobileNumber(),
                account.getAdhar(), account.getPan(), account.getAddress(),account.getBalance());

        customerdata.put(customerId, customer);
        return customer;
   }
  public void withdraw(Account account, double amount){
       if(account.balance.getAmount()>amount){
           double minimumamount = account.balance.getAmount()-amount;
           if (minimumamount>=5000){
               System.out.println("amount withdraw successful and remaining amount is "+ minimumamount);
               account.balance.setAmount(minimumamount);
           }else {
               System.out.println("shuold be greterthan 5000");
           }


       }else {
           System.out.println("insufiend balance");
       }


  }


}
