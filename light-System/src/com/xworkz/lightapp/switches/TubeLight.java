package com.xworkz.lightapp.switches;

public abstract class TubeLight implements Switch{


    public void on() {
        System.out.println("tubelight is turned on");
    }


    public void off() {
        System.out.println("tubelight is turned off");
    }


}
