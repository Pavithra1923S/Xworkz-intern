package com.xworkz.inheritance.bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.fillWater();
        bottle.cleanBottle();

        Milton milton = new Milton();
        milton.fillWater();
        milton.cleanBottle();
    }
}
