package com.kellyparks;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.setCustomerName("Kelly");
        myAccount.setCustomerEmailAddress("kelly@example.ca");
        myAccount.setCustomerPhoneNumber("555-555-5555");
        myAccount.setBalance(1000);
        myAccount.setNumber("12345");

        myAccount.withdrawal(100);
        myAccount.deposit(50);
        myAccount.withdrawal(100);
    }
}
