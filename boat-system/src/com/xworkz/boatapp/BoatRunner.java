package com.xworkz.boatapp;

import com.xworkz.boatapp.boat.Boat;

public class BoatRunner {
    public static void main(String[] args){
        System.out.println("Main Started");

    Boat ref = new Boat();
    ref.setBoatId(1);
    ref.setBoatName("kalpavruksha");
    ref.setBoatOwner("Baba");
    ref.setBoatType("sailboat");

    int bId = ref.getBoatId();
    String bName = ref.getBoatName();
    String bOwner = ref.getBoatOwner();
    String bType = ref.getBoatType();

    System.out.println("The boatid is : " + bId);
    System.out.println("The boatnmae is : " + bName);
    System.out.println("The boatOwner is : " + bOwner);
    System.out.println("The boatType is : " + bType);
    System.out.println("main ended");
    }
}
