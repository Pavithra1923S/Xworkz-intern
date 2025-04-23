package com.xworkz.method.furniture;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FurnitureDto {
    private int furnitureId;
    private String type;
    private String material;
    private String color;
    private double cost;

    @Override
    public String toString() {
        return "FurnitureDto: \nfurnitureId = " + this.furnitureId +
                " ," + "\ntype = " + this.type +
                " ," + "\nmaterial = " + this.material +
                " ," + "\ncolor = " + this.color +
                " ," + "\ncost = " + this.cost;
    }

}
