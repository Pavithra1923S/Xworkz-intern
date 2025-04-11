package com.xworkz.inheritance.utensils;

public class UtensilsRunner {
    public static void main(String[] args) {
        Utensils utensils = new Utensils();
        utensils.washUtensils();
        utensils.storeUtensils();

        Cooker cooker = new Cooker();
        cooker.washUtensils();
        cooker.storeUtensils();
    }
}
