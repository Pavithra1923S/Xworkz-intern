package com.xworkz.inheritance.compass;

public class CompassRunner {
    public static void main(String[] args) {
        Compass compass = new Compass();
        compass.pointNorth();
        compass.showDirection();

        DigitalCompass digital = new DigitalCompass();
        digital.pointNorth();
        digital.showDirection();
    }
}
