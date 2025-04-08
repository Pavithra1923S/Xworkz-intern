package com.education.chalk.chalk;

public class Chalk {
    public Object setEcoFriendly;
    private String color;
    private String type;
    private String brand;
    private boolean dustFree;
    private boolean ecoFriendly;
    private double length;
    private double price;

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDustFree(boolean dustFree) {
        this.dustFree = dustFree;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        this.ecoFriendly = ecoFriendly;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isDustFree() {
        return dustFree;
    }

    public boolean isEcoFriendly() {
        return ecoFriendly;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void details() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Dust Free: " + dustFree);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Length: " + length + " cm");
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------------");
    }
}