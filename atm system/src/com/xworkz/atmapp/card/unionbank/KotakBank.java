package com.xworkz.atmapp.card.unionbank;

import com.xworkz.atmapp.card.Card;

public class KotakBank implements Card {
    @Override
    public void insert() {
        System.out.println("KotakBank atm card is inserted");
    }

    @Override
    public void swipe() {
        System.out.println("KotakBank atm card is swipped");
    }

    @Override
    public void tap() {
        System.out.println("KotakBank atm card is tapped");

    }
}
