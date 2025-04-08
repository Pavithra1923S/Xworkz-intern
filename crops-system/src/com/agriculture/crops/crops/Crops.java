package com.agriculture.crops.crops;

public class Crops {
    private String name;
    private String type;
    private String season;
    private double areaInAcres;
    private double yieldPerAcre;
    private boolean irrigated;
    private double marketPricePerQuintal;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAreaInAcres(double areaInAcres) {
        this.areaInAcres = areaInAcres;
    }

    public void setYieldPerAcre(double yieldPerAcre) {
        this.yieldPerAcre = yieldPerAcre;
    }

    public void setIrrigated(boolean irrigated) {
        this.irrigated = irrigated;
    }

    public void setMarketPricePerQuintal(double marketPricePerQuintal) {
        this.marketPricePerQuintal = marketPricePerQuintal;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSeason() {
        return season;
    }

    public double getAreaInAcres() {
        return areaInAcres;
    }

    public double getYieldPerAcre() {
        return yieldPerAcre;
    }

    public boolean isIrrigated() {
        return irrigated;
    }

    public double getMarketPricePerQuintal() {
        return marketPricePerQuintal;
    }

    // Display method
    public void details() {
        System.out.println("Crop Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Season: " + season);
        System.out.println("Area (Acres): " + areaInAcres);
        System.out.println("Yield per Acre: " + yieldPerAcre + " quintals");
        System.out.println("Irrigated: " + irrigated);
        System.out.println("Market Price per Quintal: ₹" + marketPricePerQuintal);
        System.out.println("---------------------------------");
    }
}