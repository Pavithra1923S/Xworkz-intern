package com.xworkz.method.furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        FurnitureDto furnitureDto = new FurnitureDto();
        furnitureDto.setFurnitureId(1);
        furnitureDto.setType("Sofa");
        furnitureDto.setMaterial("Leather");
        furnitureDto.setColor("White");
        furnitureDto.setCost(70000.00);

        System.out.println(furnitureDto.toString());
    }
}
