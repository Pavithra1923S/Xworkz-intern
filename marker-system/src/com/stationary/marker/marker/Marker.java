package com.stationery.marker.marker;

public class Marker {
    private String brand;
    private String color;
    private double length;
    private boolean refillable;
    private String tipType;
    private String inkType;
    private double price;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setRefillable(boolean refillable) {
        this.refillable = refillable;
    }

    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public boolean isRefillable() {
        return refillable;
    }

    public String getTipType() {
        return tipType;
    }

    public String getInkType() {
        return inkType;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " cm");
        System.out.println("Refillable: " + refillable);
        System.out.println("Tip Type: " + tipType);
        System.out.println("Ink Type: " + inkType);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }
}