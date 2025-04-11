package com.xworkz.inheritance.fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.adjustSpeed();

        CeilingFan ceiling = new CeilingFan();
        ceiling.turnOn();
        ceiling.adjustSpeed();
    }
}
