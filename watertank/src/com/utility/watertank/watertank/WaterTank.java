package com.utility.watertank.watertank;

public class WaterTank {
    private String brand;
    private int capacityInLiters;
    private String material;
    private String color;
    private boolean isInsulated;
    private double height;
    private double diameter;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacityInLiters(int capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsulated(boolean insulated) {
        isInsulated = insulated;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getCapacityInLiters() {
        return capacityInLiters;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isInsulated() {
        return isInsulated;
    }

    public double getHeight() {
        return height;
    }

    public double getDiameter() {
        return diameter;
    }

    // Details method
    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacityInLiters + " liters");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Insulated: " + isInsulated);
        System.out.println("Height: " + height + " m");
        System.out.println("Diameter: " + diameter + " m");
        System.out.println("---------------------------");
    }
}
