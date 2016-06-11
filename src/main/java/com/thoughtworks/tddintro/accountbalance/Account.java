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
        return balance+i;
    }

    public int withdraw(int i) {
        return this.balance-i;
    }
}
