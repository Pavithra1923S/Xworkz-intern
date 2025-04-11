package com.xworkz.inheritance.sweet;


public class SweetRunner {
    public static void main(String[] args) {


        Sweet sweet = new Sweet();
        sweet.tasty();
        sweet.enjoyable();

        Mysorepak mysorepak = new Mysorepak();
        mysorepak.tasty();
        mysorepak.enjoyable();

         Sweet sweet1 = new Mysorepak();
        System.out.println(sweet1);

        Mysorepak mysorepak1 =(Mysorepak)sweet1;
        System.out.println(mysorepak1);


    }
}