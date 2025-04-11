package com.xworkz.inheritance.bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.fillWater();
        bottle.cleanBottle();

        Milton milton = new Milton();
        milton.fillWater();
        milton.cleanBottle();

        Bottle bottle1 = new Milton();
        System.out.println(bottle1);

        Milton milton1 = (Milton) bottle1;
        System.out.println(milton1);

    }
}
