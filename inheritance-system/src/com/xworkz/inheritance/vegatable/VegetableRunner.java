package com.xworkz.inheritance.vegatable;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable veg = new Vegetable();
        veg.washVegetable();
        veg.chopVegetable();

        Carrot carrot = new Carrot();
        carrot.washVegetable();
        carrot.chopVegetable();
    }

}
