package com.xworkz.inheritance.watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.showTime();
        watch.setAlarm();

        SmartWatch smart = new SmartWatch();
        smart.showTime();
        smart.setAlarm();

        Watch watch1 = new SmartWatch();
        System.out.println(watch1);

        SmartWatch smartWatch =(SmartWatch) watch1;
        System.out.println(smartWatch);
    }
}
