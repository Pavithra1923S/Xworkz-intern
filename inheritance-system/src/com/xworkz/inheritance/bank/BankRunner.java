package com.xworkz.inheritance.bank;

public class BankRunner {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.deposit();
        bank.interestRate();

        CanaraBank canaraBank = new CanaraBank();
        canaraBank.deposit();
        canaraBank.interestRate();
    }
}
