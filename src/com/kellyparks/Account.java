package com.kellyparks;

/**
 * Created by KellyParks on 2017-02-23.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. Balance is now " + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <= 0){
            System.out.println("Insufficient funds. Only " + this.balance + " available. No withdrawal could be made.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

