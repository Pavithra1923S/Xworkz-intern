package com.xworkz.inheritance.wood;

public class WoodRunner {
    public static void main(String[] args) {


        Wood wood = new Wood();
        wood.heavy();
        wood.strong();

        Furnitures furnitures = new Furnitures();
        furnitures.heavy();
        furnitures.strong();

        Wood wood1 = new Furnitures();
        System.out.println(wood1);

        Furnitures furnitures1 =(Furnitures) wood1;
        System.out.println(furnitures1);
    }
}
