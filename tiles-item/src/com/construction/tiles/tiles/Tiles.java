package com.construction.tiles.tiles;

public class Tiles {
    private String material;
    private String color;
    private String finish;
    private String brand;
    private double sizeInInches;
    private boolean antiSkid;
    private double pricePerSqft;

    // Setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSizeInInches(double sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public void setAntiSkid(boolean antiSkid) {
        this.antiSkid = antiSkid;
    }

    public void setPricePerSqft(double pricePerSqft) {
        this.pricePerSqft = pricePerSqft;
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getFinish() {
        return finish;
    }

    public String getBrand() {
        return brand;
    }

    public double getSizeInInches() {
        return sizeInInches;
    }

    public boolean isAntiSkid() {
        return antiSkid;
    }

    public double getPricePerSqft() {
        return pricePerSqft;
    }

    // Display method
    public void details() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Finish: " + finish);
        System.out.println("Brand: " + brand);
        System.out.println("Size (inches): " + sizeInInches);
        System.out.println("Anti-skid: " + antiSkid);
        System.out.println("Price per Sqft: ₹" + pricePerSqft);
        System.out.println("----------------------------------");
    }
}