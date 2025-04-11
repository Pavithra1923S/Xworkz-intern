package com.xworkz.inheritance.latern;

public class LaternRunner {
    public static void main(String[] args) {
        Lantern lantern = new Lantern();
        lantern.lightLantern();
        lantern.extinguishLantern();

        SolarLantern solar = new SolarLantern();
        solar.lightLantern();
        solar.extinguishLantern();


        Lantern lantern1 = new SolarLantern();
        System.out.println(lantern1);

        SolarLantern solarLantern =(SolarLantern) lantern1;
        System.out.println(solarLantern);
    }
}
