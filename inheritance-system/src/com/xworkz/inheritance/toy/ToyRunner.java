package com.xworkz.inheritance.toy;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.playWithToy();
        toy.storeToy();

        RemoteCar car = new RemoteCar();
        car.playWithToy();
        car.storeToy();
    }
}
