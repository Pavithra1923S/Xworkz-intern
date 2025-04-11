package com.xworkz.inheritance.cloth;



public class ClothRunner {
    public static void main(String[] args) {


        Cloth cloth = new Cloth();
        cloth.covers();
        cloth.material();

        Top top = new Top();
        top.material();
        top.covers();

        Cloth cloth1 = new Top();
        System.out.println(cloth1);

        Top top1 =(Top) cloth1;
        System.out.println(top1);
    }
}
