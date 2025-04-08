package com.utilities.itke.itke;

public class Itke {
    private String type;
    private String color;
    private double weightInGrams;
    private String brand;
    private boolean reusable;
    private double price;
    private String material;

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isReusable() {
        return reusable;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    // Display method
    public void details() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weightInGrams + "g");
        System.out.println("Brand: " + brand);
        System.out.println("Reusable: " + reusable);
        System.out.println("Price: ₹" + price);
        System.out.println("Material: " + material);
        System.out.println("--------------------------------------");
    }
}