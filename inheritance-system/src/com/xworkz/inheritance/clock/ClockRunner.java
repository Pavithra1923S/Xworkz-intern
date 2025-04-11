package com.xworkz.inheritance.clock;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.showTime();
        clock.setAlarm();

        DigitalClock digital = new DigitalClock();
        digital.showTime();
        digital.setAlarm();

        Clock clock1 = new DigitalClock();
        System.out.println(clock1);

        DigitalClock digitalClock =(DigitalClock) clock1;
        System.out.println(digitalClock);}
}
