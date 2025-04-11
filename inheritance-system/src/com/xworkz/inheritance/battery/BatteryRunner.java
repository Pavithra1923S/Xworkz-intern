package com.xworkz.inheritance.battery;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.chargeBattery();
        battery.checkPowerLevel();

        RechargeableBattery rBattery = new RechargeableBattery();
        rBattery.chargeBattery();
        rBattery.checkPowerLevel();
    }
}
