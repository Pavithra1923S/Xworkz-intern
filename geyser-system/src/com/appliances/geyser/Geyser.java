package com.appliances.geyser.geyser;

public class Geyser {
    private String brand;
    private int capacityLiters;
    private boolean isInstant;
    private String powerSource;
    private double powerConsumption;
    private String material;
    private double price;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacityLiters(int capacityLiters) {
        this.capacityLiters = capacityLiters;
    }

    public void setIsInstant(boolean isInstant) {
        this.isInstant = isInstant;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getCapacityLiters() {
        return capacityLiters;
    }

    public boolean isInstant() {
        return isInstant;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacityLiters + " Liters");
        System.out.println("Instant Heating: " + isInstant);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------------------------");
    }
}