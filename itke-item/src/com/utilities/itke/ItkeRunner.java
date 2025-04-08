package com.utilities.itke;

import com.utilities.itke.itke.Itke;

public class ItkeRunner {
    public static void main(String[] args) {
        Itke itke1 = new Itke();
        itke1.setType("Water Bottle");
        itke1.setColor("Blue");
        itke1.setWeightInGrams(250);
        itke1.setBrand("Milton");
        itke1.setReusable(true);
        itke1.setPrice(299.99);
        itke1.setMaterial("Plastic");

        Itke itke2 = new Itke();
        itke2.setType("Lunch Box");
        itke2.setColor("Red");
        itke2.setWeightInGrams(400);
        itke2.setBrand("Cello");
        itke2.setReusable(true);
        itke2.setPrice(399.50);
        itke2.setMaterial("Steel");

        Itke itke3 = new Itke();
        itke3.setType("Storage Box");
        itke3.setColor("Transparent");
        itke3.setWeightInGrams(550);
        itke3.setBrand("Tupperware");
        itke3.setReusable(true);
        itke3.setPrice(649.00);
        itke3.setMaterial("Plastic");

        Itke itke4 = new Itke();
        itke4.setType("Kitchen Jar");
        itke4.setColor("White");
        itke4.setWeightInGrams(150);
        itke4.setBrand("Signoraware");
        itke4.setReusable(true);
        itke4.setPrice(199.00);
        itke4.setMaterial("Glass");

        Itke itke5 = new Itke();
        itke5.setType("Jug");
        itke5.setColor("Green");
        itke5.setWeightInGrams(300);
        itke5.setBrand("Borosil");
        itke5.setReusable(true);
        itke5.setPrice(349.75);
        itke5.setMaterial("Plastic");

        itke1.details();
        itke2.details();
        itke3.details();
        itke4.details();
        itke5.details();
    }
}