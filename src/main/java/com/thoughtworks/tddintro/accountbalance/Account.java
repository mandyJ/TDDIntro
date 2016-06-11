package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by Mandy on 2016-06-10.
 */
public class Account {

    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public int deposit(int i) {
        balance+=i;
        return balance;
    }

    public int withdraw(int i) {

        if(i > balance)
            return balance;
        else{
            balance-=i;
            return balance;
        }

    }
}
