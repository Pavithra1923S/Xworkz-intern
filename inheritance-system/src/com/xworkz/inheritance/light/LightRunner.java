package com.xworkz.inheritance.light;


public class LightRunner {
    public static void main(String[] args) {


        Light light = new Light();
        light.see();
        light.source();

        TubeLight tb = new TubeLight();
        tb.see();
        tb.source();

        Light light1 = new TubeLight();
        System.out.println(light1);

        TubeLight tubeLight =(TubeLight) light1;
        System.out.println(tubeLight);



    }
}
