package com.xworkz.inheritance.plastic;

public class PlasticRunner {
    public static void main(String[] args) {


        Plastic plastic = new Plastic();
        plastic.validatePlasticDetails();
        plastic.getPlasticInfo();

        Bottle bottle = new Bottle();
        bottle.validatePlasticDetails();
        bottle.getPlasticInfo();

        Plastic plastic1 = new Bottle();
        System.out.println(plastic1);

        Bottle bottle1 =(Bottle) plastic1;
        System.out.println(bottle1);
    }
}

