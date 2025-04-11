package com.xworkz.inheritance.blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket();
        blanket.foldBlanket();
        blanket.washBlanket();

        WoolenBlanket woolen = new WoolenBlanket();
        woolen.foldBlanket();
        woolen.washBlanket();
    }
}
