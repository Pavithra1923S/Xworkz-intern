package com.xworkz.inheritance.gold;

public class GoldRunner {
    public static void main(String[] args) {


        Gold gold = new Gold();
        gold.costly();
        gold.valuable();

        Jewel jewel = new Jewel();
        jewel.costly();
        jewel.valuable();

        Gold gold1 = new Jewel();
        System.out.println(gold1);

        Jewel jewel1 =(Jewel) gold1;
        System.out.println(jewel1);
    }
}
