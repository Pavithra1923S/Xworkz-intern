package com.furniture.mattress.mattress;

public class Mattress {
    private String brand;
    private String type;
    private double thickness;
    private double length;
    private double width;
    private boolean orthopedic;
    private double price;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setOrthopedic(boolean orthopedic) {
        this.orthopedic = orthopedic;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getThickness() {
        return thickness;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public boolean isOrthopedic() {
        return orthopedic;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Thickness: " + thickness + " inches");
        System.out.println("Length: " + length + " inches");
        System.out.println("Width: " + width + " inches");
        System.out.println("Orthopedic: " + orthopedic);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------------");
    }
}