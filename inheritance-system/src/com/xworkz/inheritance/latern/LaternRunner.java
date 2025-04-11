package com.xworkz.inheritance.latern;

public class LaternRunner {
    public static void main(String[] args) {
        Lantern lantern = new Lantern();
        lantern.lightLantern();
        lantern.extinguishLantern();

        SolarLantern solar = new SolarLantern();
        solar.lightLantern();
        solar.extinguishLantern();
    }
}
