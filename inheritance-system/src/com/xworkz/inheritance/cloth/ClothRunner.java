package com.xworkz.inheritance.cloth;



public class ClothRunner {
    public static void main(String[] args) {


        Cloth cloth = new Cloth();
        cloth.covers();
        cloth.material();

        Top top = new Top();
        top.material();
        top.covers();
    }
}
