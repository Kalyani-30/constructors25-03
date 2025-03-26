package com.neoteric.variable.accountholder;

import com.neoteric.variable.Address;

public class AccountTest {

    public static void main(String[] args) {

        AccountService accountService=new AccountService();
        Address address= new Address("hyd","50050");
        Balance balance= new Balance(6000.0);
        Account account=new Account("123456","kallu",

                "345678990","12111222233","EX234SZ", address,balance);

        accountService.amountStatus(account);
    }
}
