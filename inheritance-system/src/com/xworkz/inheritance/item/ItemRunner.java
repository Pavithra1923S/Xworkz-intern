package com.xworkz.inheritance.item;


public class ItemRunner {
    public static void main(String args[]) {

        Item item = new Item();
        item.turnOn();
        item.turnOff();

        Fridge fridge = new Fridge();
        fridge.turnOn();
        fridge.turnOff();
    }
}
