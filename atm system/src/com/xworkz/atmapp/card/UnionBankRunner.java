package com.xworkz.atmapp.card;

import com.xworkz.atmapp.card.unionbank.KotakBank;
import com.xworkz.atmapp.card.unionbank.UnionBank;

public class UnionBankRunner {
    public static void main(String[] args){
        Card aCard =new UnionBank();
        aCard.insert();
        aCard.tap();
        aCard.swipe();


        Card bCard = new KotakBank();
        bCard.swipe();
        bCard.tap();
        bCard.insert();


    }
}
