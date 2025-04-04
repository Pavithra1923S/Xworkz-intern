package com.xworkz.paintapp.paint;

public class Paint {
    private int paintId;
    private String brand;
    private int price;
    private String manfDate;
    private String color;
    private String expdate;
    private String paintType;


    public void setPaintId(int paintId){
        this.paintId = paintId;
    }
    public int getPaintId(){
        return paintId;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setManfDate(String manfDate){
        this.manfDate = manfDate;
    }
    public String getManfDate(){
        return manfDate;
    }
    public void setExpdate(String expdate){
        this.expdate = expdate;
    }
    public String getExpdate(){
        return expdate;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setPaintType(String paintType){
        this.paintType = paintType;
    }
    public String getPaintType(){
        return paintType;
    }
}

