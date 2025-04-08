package com.kitchen.cooker;

import com.kitchen.cooker.cooker.Cooker;

public class CookerRunner {
    public static void main(String[] args) {
        Cooker cooker1 = new Cooker();
        cooker1.setBrand("Prestige");
        cooker1.setCapacityLiters(5.0);
        cooker1.setIsInductionBase(true);
        cooker1.setMaterial("Aluminium");
        cooker1.setNumberOfSafetyValves(2);
        cooker1.setPrice(2499.50);
        cooker1.setType("Pressure Cooker");

        Cooker cooker2 = new Cooker();
        cooker2.setBrand("Hawkins");
        cooker2.setCapacityLiters(3.0);
        cooker2.setIsInductionBase(false);
        cooker2.setMaterial("Stainless Steel");
        cooker2.setNumberOfSafetyValves(1);
        cooker2.setPrice(1999.00);
        cooker2.setType("Handi Cooker");

        Cooker cooker3 = new Cooker();
        cooker3.setBrand("Butterfly");
        cooker3.setCapacityLiters(6.5);
        cooker3.setIsInductionBase(true);
        cooker3.setMaterial("Hard Anodized");
        cooker3.setNumberOfSafetyValves(2);
        cooker3.setPrice(2999.75);
        cooker3.setType("Deluxe Cooker");

        Cooker cooker4 = new Cooker();
        cooker4.setBrand("Pigeon");
        cooker4.setCapacityLiters(2.0);
        cooker4.setIsInductionBase(false);
        cooker4.setMaterial("Aluminium");
        cooker4.setNumberOfSafetyValves(1);
        cooker4.setPrice(1399.99);
        cooker4.setType("Mini Cooker");

        Cooker cooker5 = new Cooker();
        cooker5.setBrand("Borosil");
        cooker5.setCapacityLiters(4.0);
        cooker5.setIsInductionBase(true);
        cooker5.setMaterial("Stainless Steel");
        cooker5.setNumberOfSafetyValves(3);
        cooker5.setPrice(3199.25);
        cooker5.setType("Multi-cooker");

        cooker1.details();
        cooker2.details();
        cooker3.details();
        cooker4.details();
        cooker5.details();
    }
}