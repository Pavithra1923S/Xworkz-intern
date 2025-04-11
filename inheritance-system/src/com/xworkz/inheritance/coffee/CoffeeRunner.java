package com.xworkz.inheritance.coffee;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.brewCoffee();
        coffee.serveCoffee();

        ColdCoffee cold = new ColdCoffee();
        cold.brewCoffee();
        cold.serveCoffee();

        Coffee coffee1 = new ColdCoffee();
        System.out.println(coffee1);

        ColdCoffee coldCoffee =(ColdCoffee) coffee1;
        System.out.println(coldCoffee);
    }
}
