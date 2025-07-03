package com.xworkz.lightapp;

import com.xworkz.lightapp.switches.CFL;
import com.xworkz.lightapp.switches.Switch;
import com.xworkz.lightapp.switches.TubeLight;

public class LightRunner {
    public static void main(String[] args){

        Switch aSwitch = new CFL();
        aSwitch.on();
        aSwitch.off();



    }
}
