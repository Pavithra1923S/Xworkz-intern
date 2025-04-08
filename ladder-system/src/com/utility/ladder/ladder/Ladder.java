package com.utility.ladder.ladder;

public class Ladder {
    private String material;
    private int steps;
    private double heightInFeet;
    private String color;
    private boolean foldable;
    private double weight;
    private double price;

    // Setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setHeightInFeet(double heightInFeet) {
        this.heightInFeet = heightInFeet;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public int getSteps() {
        return steps;
    }

    public double getHeightInFeet() {
        return heightInFeet;
    }

    public String getColor() {
        return color;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void details() {
        System.out.println("Material: " + material);
        System.out.println("Steps: " + steps);
        System.out.println("Height: " + heightInFeet + " ft");
        System.out.println("Color: " + color);
        System.out.println("Foldable: " + foldable);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------------");
    }
}