package com.nation.defence.defence;

public class Defence {
    private String branch;
    private String rank;
    private int soldiers;
    private boolean isActive;
    private String headquarter;
    private double annualBudget;
    private String country;

    // Setters
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setHeadquarter(String headquarter) {
        this.headquarter = headquarter;
    }

    public void setAnnualBudget(double annualBudget) {
        this.annualBudget = annualBudget;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Getters
    public String getBranch() {
        return branch;
    }

    public String getRank() {
        return rank;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getHeadquarter() {
        return headquarter;
    }

    public double getAnnualBudget() {
        return annualBudget;
    }

    public String getCountry() {
        return country;
    }

    // Display method
    public void details() {
        System.out.println("Branch: " + branch);
        System.out.println("Rank: " + rank);
        System.out.println("Soldiers: " + soldiers);
        System.out.println("Active: " + isActive);
        System.out.println("Headquarter: " + headquarter);
        System.out.println("Annual Budget: $" + annualBudget + " Billion");
        System.out.println("Country: " + country);
        System.out.println("-------------------------------------------");
    }
}