package com.kitchen.cooker.cooker;

public class Cooker {
    private String brand;
    private double capacityLiters;
    private boolean isInductionBase;
    private String material;
    private int numberOfSafetyValves;
    private double price;
    private String type;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacityLiters(double capacityLiters) {
        this.capacityLiters = capacityLiters;
    }

    public void setIsInductionBase(boolean isInductionBase) {
        this.isInductionBase = isInductionBase;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumberOfSafetyValves(int numberOfSafetyValves) {
        this.numberOfSafetyValves = numberOfSafetyValves;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getCapacityLiters() {
        return capacityLiters;
    }

    public boolean isInductionBase() {
        return isInductionBase;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfSafetyValves() {
        return numberOfSafetyValves;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    // Display method
    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacityLiters + " Liters");
        System.out.println("Induction Base: " + isInductionBase);
        System.out.println("Material: " + material);
        System.out.println("Safety Valves: " + numberOfSafetyValves);
        System.out.println("Price: ₹" + price);
        System.out.println("Type: " + type);
        System.out.println("--------------------------------------");
    }
}