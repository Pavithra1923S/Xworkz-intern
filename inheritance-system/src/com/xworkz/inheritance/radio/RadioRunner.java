package com.xworkz.inheritance.radio;

public class RadioRunner {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.tuneFrequency();
        radio.playBroadcast();

        FMRadio fm = new FMRadio();
        fm.tuneFrequency();
        fm.playBroadcast();
    }

}
