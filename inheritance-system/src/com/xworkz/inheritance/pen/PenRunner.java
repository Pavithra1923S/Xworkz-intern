package com.xworkz.inheritance.pen;


public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.writeText();
        pen.refillInk();

        GelPen gelPen = new GelPen();
        gelPen.writeText();
        gelPen.refillInk();

        Pen pen1 = new GelPen();
        System.out.println(pen1);

        GelPen gelPen1 =(GelPen) pen1;
        System.out.println(gelPen1);
    }
}
