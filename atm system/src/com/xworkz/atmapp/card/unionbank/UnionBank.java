package com.xworkz.atmapp.card.unionbank;

import com.xworkz.atmapp.card.Card;

public class UnionBank implements Card {


    @Override
    public void insert() {
        System.out.println("unionbank card atm is inserted");
    }

    @Override
    public void swipe() {
        System.out.println("union bank atm card is swipped");
    }

    @Override
    public void tap() {
        System.out.println("union bank atm card is tapped");
    }
}
