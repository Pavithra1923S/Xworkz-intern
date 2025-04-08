package com.beverage.majige;

import com.beverage.majige.majige.Majige;

public class MajigeRunner {
    public static void main(String[] args) {
        Majige majige1 = new Majige();
        majige1.setBrand("Nandini");
        majige1.setFlavor("Classic");
        majige1.setSaltAdded(true);
        majige1.setChilled(true);
        majige1.setQuantityInLitres(0.5);
        majige1.setContainerType("Bottle");
        majige1.setPrice(12.00);

        Majige majige2 = new Majige();
        majige2.setBrand("Amul");
        majige2.setFlavor("Masala");
        majige2.setSaltAdded(true);
        majige2.setChilled(false);
        majige2.setQuantityInLitres(1.0);
        majige2.setContainerType("Tetra Pack");
        majige2.setPrice(25.00);

        Majige majige3 = new Majige();
        majige3.setBrand("Local Dairy");
        majige3.setFlavor("Sweet");
        majige3.setSaltAdded(false);
        majige3.setChilled(true);
        majige3.setQuantityInLitres(0.75);
        majige3.setContainerType("Glass");
        majige3.setPrice(15.50);

        Majige majige4 = new Majige();
        majige4.setBrand("KMF");
        majige4.setFlavor("Spicy");
        majige4.setSaltAdded(true);
        majige4.setChilled(true);
        majige4.setQuantityInLitres(0.3);
        majige4.setContainerType("Plastic Cup");
        majige4.setPrice(10.00);

        Majige majige5 = new Majige();
        majige5.setBrand("A2 Dairy");
        majige5.setFlavor("Plain");
        majige5.setSaltAdded(false);
        majige5.setChilled(false);
        majige5.setQuantityInLitres(1.5);
        majige5.setContainerType("Steel Can");
        majige5.setPrice(40.00);

        majige1.details();
        majige2.details();
        majige3.details();
        majige4.details();
        majige5.details();
    }
}