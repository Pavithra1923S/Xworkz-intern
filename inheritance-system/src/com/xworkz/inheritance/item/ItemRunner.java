package com.xworkz.inheritance.item;

public class ItemRunner {
    public static void main(String args[]) {

        Item item = new Item();
        item.turnOn();
        item.turnOff();

        Fridge fridge = new Fridge();
        fridge.turnOn();
        fridge.turnOff();

        Item item1  = new Fridge();
        System.out.println(item1);

        Fridge fridge1 =(Fridge) item1;
        System.out.println(fridge1);
    }
}
