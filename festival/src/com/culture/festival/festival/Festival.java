package com.culture.festival.festival;

public class Festival {
    private String name;
    private String country;
    private String season;
    private int durationDays;
    private boolean isPublicHoliday;
    private String mainActivity;
    private String originYear;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public void setIsPublicHoliday(boolean isPublicHoliday) {
        this.isPublicHoliday = isPublicHoliday;
    }

    public void setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void setOriginYear(String originYear) {
        this.originYear = originYear;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSeason() {
        return season;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public boolean isPublicHoliday() {
        return isPublicHoliday;
    }

    public String getMainActivity() {
        return mainActivity;
    }

    public String getOriginYear() {
        return originYear;
    }

    // Display method
    public void details() {
        System.out.println("Festival Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Season: " + season);
        System.out.println("Duration (Days): " + durationDays);
        System.out.println("Public Holiday: " + isPublicHoliday);
        System.out.println("Main Activity: " + mainActivity);
        System.out.println("Origin Year: " + originYear);
        System.out.println("------------------------------------------");
    }
}