package com.xworkz.inheritance.utensils;


public class UtensilsRunner {
    public static void main(String[] args) {
        Utensils utensils = new Utensils();
        utensils.washUtensils();
        utensils.storeUtensils();

        Cooker cooker = new Cooker();
        cooker.washUtensils();
        cooker.storeUtensils();

        Utensils utensils1 = new Cooker();
        System.out.println(utensils1);

        Cooker cooker1 =(Cooker)utensils1;
        System.out.println(cooker1);
    }
}
