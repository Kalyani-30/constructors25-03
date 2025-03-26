package com.neoteric.variable.methods;

public class CallByValueDemo {
    public static void main(String[] args) {
        Amount amount= new Amount();
        amount.amount=123.0;
        amount.currency="INR";

        Amount amount2= new Amount();
        amount2.amount=123.0;
        amount2.currency="INR";

        Amount amount3=amount2;
        amount3.amount=1234.0;
        System.out.println(amount2.amount);
    }
}
