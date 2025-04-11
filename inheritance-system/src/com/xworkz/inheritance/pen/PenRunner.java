package com.xworkz.inheritance.pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.writeText();
        pen.refillInk();

        GelPen gelPen = new GelPen();
        gelPen.writeText();
        gelPen.refillInk();
    }
}
