package com.xworkz.inheritance.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.openLid();
        laptop.launchApplication();

        GamingLaptop gamer = new GamingLaptop();
        gamer.openLid();
        gamer.launchApplication();
    }

}
