package com.xworkz.inheritance.blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket();
        blanket.foldBlanket();
        blanket.washBlanket();

        WoolenBlanket woolen = new WoolenBlanket();
        woolen.foldBlanket();
        woolen.washBlanket();

        Blanket blanket1 = new WoolenBlanket();
        System.out.println(blanket1);

        WoolenBlanket woolenBlanket = (WoolenBlanket)blanket1;
        System.out.println(woolenBlanket);
    }
}
