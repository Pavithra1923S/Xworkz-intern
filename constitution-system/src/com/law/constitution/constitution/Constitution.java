package com.law.constitution.constitution;

public class Constitution {
    private String country;
    private int articles;
    private int schedules;
    private int amendments;
    private String adoptedDate;
    private String effectiveDate;
    private boolean isWritten;

    // Setters
    public void setCountry(String country) {
        this.country = country;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public void setSchedules(int schedules) {
        this.schedules = schedules;
    }

    public void setAmendments(int amendments) {
        this.amendments = amendments;
    }

    public void setAdoptedDate(String adoptedDate) {
        this.adoptedDate = adoptedDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setWritten(boolean isWritten) {
        this.isWritten = isWritten;
    }

    // Getters
    public String getCountry() {
        return country;
    }

    public int getArticles() {
        return articles;
    }

    public int getSchedules() {
        return schedules;
    }

    public int getAmendments() {
        return amendments;
    }

    public String getAdoptedDate() {
        return adoptedDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public boolean isWritten() {
        return isWritten;
    }

    // Display method
    public void details() {
        System.out.println("Country: " + country);
        System.out.println("Articles: " + articles);
        System.out.println("Schedules: " + schedules);
        System.out.println("Amendments: " + amendments);
        System.out.println("Adopted Date: " + adoptedDate);
        System.out.println("Effective Date: " + effectiveDate);
        System.out.println("Written Constitution: " + isWritten);
        System.out.println("---------------------------------------");
    }
}