package com.xworkz.inheritance.watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.showTime();
        watch.setAlarm();

        SmartWatch smart = new SmartWatch();
        smart.showTime();
        smart.setAlarm();
    }
}
