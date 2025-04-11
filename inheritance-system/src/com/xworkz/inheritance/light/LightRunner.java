package com.xworkz.inheritance.light;

import com.xworkz.inheritance.sweet.Mysorepak;
import com.xworkz.inheritance.sweet.Sweet;

public class LightRunner {
    public static void main(String[] args) {


        Light light = new Light();
        light.see();
        light.source();

        TubeLight tb = new TubeLight();
        tb.see();
        tb.source();



    }
}
