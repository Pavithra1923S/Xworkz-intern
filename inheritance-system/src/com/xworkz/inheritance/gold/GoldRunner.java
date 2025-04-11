package com.xworkz.inheritance.gold;

public class GoldRunner {
    public static void main(String[] args) {


        Gold gold = new Gold();
        gold.costly();
        gold.valuable();

        Jewel jewel = new Jewel();
        jewel.costly();
        jewel.valuable();
    }
}
