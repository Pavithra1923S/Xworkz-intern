package com.xworkz.inheritance.India;

public class IndiaRunner {
    public static void main(String[] args) {
        India india = new India();
        india.showNationalAnimal();
        india.showNationalAnthem();

        Karnataka state = new Karnataka();
        state.showNationalAnimal();
        state.showNationalAnthem();

        India india1 = new Karnataka();
        System.out.println(india1);

        Karnataka karnataka =(Karnataka) india1;
        System.out.println(karnataka);
    }
}
