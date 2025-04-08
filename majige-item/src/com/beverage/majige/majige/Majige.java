package com.beverage.majige.majige;

public class Majige {
    private String brand;
    private String flavor;
    private boolean isSaltAdded;
    private boolean isChilled;
    private double quantityInLitres;
    private String containerType;
    private double price;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSaltAdded(boolean isSaltAdded) {
        this.isSaltAdded = isSaltAdded;
    }

    public void setChilled(boolean isChilled) {
        this.isChilled = isChilled;
    }

    public void setQuantityInLitres(double quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public boolean isSaltAdded() {
        return isSaltAdded;
    }

    public boolean isChilled() {
        return isChilled;
    }

    public double getQuantityInLitres() {
        return quantityInLitres;
    }

    public String getContainerType() {
        return containerType;
    }

    public double getPrice() {
        return price;
    }

    // Display Method
    public void details() {
        System.out.println("Majige Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Salt Added: " + isSaltAdded);
        System.out.println("Chilled: " + isChilled);
        System.out.println("Quantity (L): " + quantityInLitres);
        System.out.println("Container Type: " + containerType);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------------");
    }
}